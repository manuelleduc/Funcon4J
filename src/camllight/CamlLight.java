package camllight;

import camllight.lib.StandardLibrary;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CamlLight {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <X> X parse(String s, camllight.algebras.AllAlg alg) {
        CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    public static IValue eval(String src) throws FunconException {
        final funcons.algebras.AllAlg<IEval> evalAlg = new funcons.interpreter.AllFactory() {};
        return eval(src, () -> evalAlg);
    }

    public static IValue eval(String src, camllight.algebras.AllAlg alg) throws FunconException {
        Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
        IEval eval = builder.build(alg);
        IValue env = importStandardLibrary(ValueFactory.getInstance().mapWriter().done());
        return eval.eval((IMap)env, new Null());
    }

    private static void interpret(String src) throws FunconException {
        System.out.println("== Interpreting ==");
        System.out.println(src);
        System.out.println("Print output: ");
        eval(src);
        System.out.println();
        System.out.println();
    }

    private static void run(String fileLoc) throws IOException, FunconException {
        String fileContent = new String(Files.readAllBytes(Paths.get(fileLoc)));
        System.out.println("== Running: " + fileLoc + " ==");
//        camllight.algebras.AllAlg<IEval> myalg = () -> new funcons.interpreter.value.RecordFactory() {};
//        eval(fileContent, new Tracer<>(myalg, new Class<?>[] {camllight.algebras.AllAlg.class}).make());
        interpret(fileContent);
    }

    private static void runPerformance(String fileLoc, int n) throws IOException, FunconException {
        List<Long> timings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String src = new String(Files.readAllBytes(Paths.get(fileLoc)));
            Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
            funcons.interpreter.AllFactory funconFactory = new funcons.interpreter.AllFactory() {
            };
            camllight.algebras.AllAlg alg = () -> funconFactory;
            IEval eval = builder.build(alg);
            IValue env = importStandardLibrary(funconFactory.environment().eval());
            long start = System.currentTimeMillis();
            eval.eval((IMap) env, new Null());
            long end = System.currentTimeMillis();
            timings.add(end - start);
            System.out.println("time taken: " + (end - start));
        }
        System.out.println("fastest time: " + Collections.min(timings));
    }

    private static void runAll(String folderLoc) throws IOException, FunconException {
        runAllButExclude(folderLoc, new ArrayList<>());
    }

    private static void runAllButExclude(String folderLoc, List<String> fileEndings) throws IOException, FunconException {
        File folder = new File(folderLoc);
        File[] files = folder.listFiles();

        assert files != null;
        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".ml")) {
                if (fileEndings.stream().anyMatch(s -> f.getName().endsWith(s))) {
                    continue;
                }
                run(f.getAbsolutePath());
            } else if (f.isDirectory()) {
                runAll(f.getAbsolutePath());
            }
        }
    }

    public static IValue importStandardLibrary(IValue env) throws FunconException {
        return importStandardLibrary(env, new HashSet<>());
    }

    public static IValue importStandardLibrary(IValue env, Set<String> excludes) throws FunconException {
        funcons.algebras.AllAlg<IEval> alg = new funcons.interpreter.AllFactory() {
        };
        StandardLibrary<IEval> lib = () -> alg;

        for (Method m : lib.getClass().getMethods()) {
            java.lang.String methodName = m.getName();
            if (!methodName.endsWith("Fun")) {
                continue;
            }
            methodName = methodName.substring(0, methodName.length() - 3);

            if (excludes.contains(methodName)) {
                continue;
            }

            try {
                final IValue env2 = env;
                env = alg.mapUnion(
                        (e, g) -> env2,
                        alg.bindValue(alg.id(methodName), (funcons.carriers.IEval) m.invoke(lib))
                ).eval((IMap) env, new Null());
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return env;
    }

    private static void runExamples() throws IOException, FunconException {
        run("examples/fib.ml");
        run("examples/sieve.ml");
    }

    private static void runGivenTests() throws IOException, FunconException {
        runAll("givenTests/Advanced");
        runAll("givenTests/Basic");
        runAll("givenTests/Equality"); // structural equality on variables fails???
        runAll("givenTests/MuRecTypes");
        runAllButExclude("givenTests/OL", Arrays.asList("OL12.ml", "OL17.ml", "OL25.ml", "OL18.ml")); // precedence issues in OL5.ml
        runAllButExclude("givenTests/PM", Arrays.asList("PM10.ml", "PM14.ml", "PM4.ml")); // curried fun with multiple patterns, should they be supported?
        runAllButExclude("givenTests/Shadowing", Arrays.asList("Shadowing3.ml", "Shadowing6.ml")); // shadowing 3 & 6 -> patternmatching on type?
        //runAll("givenTests/Syntax"); // missing the syntactic sugar, fix?
        runAll("givenTests/Types");
        runAll("givenTests/Valres");
    }

    private static void runPerformanceTests() throws IOException, FunconException {
        // runPerformance("performanceTests/mandelbrot.ml", 10); // FunCaml: 387.1s, Ocaml: 75.5s, Py: 170.2s
        runPerformance("performanceTests/fib.ml", 10); // FunCaml: 237.8s, Ocaml: 8.1s, FunCamlOnRascal: 247.6s
        runPerformance("performanceTests/ack.ml", 10); // FunCaml: 126.s, Ocaml: 1.4s, FunCamlOnRascal: 188.5s
        runPerformance("performanceTests/harmonic.ml", 10); // FunCaml: 38.7s, Ocaml: 0.2s, FunCamlOnRascal: 7.2s
        runPerformance("performanceTests/tak.ml", 10); // FunCaml: 406.7s, Ocaml: 5.9s
    }

    public static void main(String[] args) throws FunconException, IOException {
        //runExamples();
        //runGivenTests();
        //runPerformanceTests();

        /*
        camllight.algebras.AllAlg<IEval> myalg = () -> new funcons.interpreter.AllFactory() {};
        IValue v = CamlLight.eval(
                "let rec countdown x = ( if x > 0 then countdown (x - 1));; countdown 2;;",
                new Tracer<>(myalg, new Class<?>[] {camllight.algebras.AllAlg.class}).make());

        */
    }
}