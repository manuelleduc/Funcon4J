package camllight.truffle.nodes;

import camllight.algebras.AllAlg;
import camllight.lib.StandardLibrary;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@TruffleLanguage.Registration(id = "fnc", name = "FNC",
        version = "0.12", mimeType = FNCLanguage.MIME_TYPE)
public class FNCLanguage extends TruffleLanguage<FNCContext> {
    public static final String MIME_TYPE = "application/x-fnc";

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <X> X parse(String s, camllight.algebras.AllAlg alg) {
        CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    public static IValue eval(String src) throws FunconException {
        final funcons.algebras.AllAlg<CLExecuteNode> evalAlg = new funcons.truffle.TruffleAllFactory() {
        };

        return eval(src, () -> evalAlg);
    }

    public static IValue eval(String src, AllAlg alg) throws FunconException {
        Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
        CLExecuteNode eval = builder.build(alg);
        IValue env = importStandardLibrary(ValueFactory.getInstance().mapWriter().done());


        return eval.eval((IMap) env, new Null());
    }

    private IValue interpret(String src) throws FunconException {
        System.out.println("== Interpreting ==");
        System.out.println(src);
        System.out.println("Print output: ");
        IValue res = eval(src);
        System.out.println();
        System.out.println();
        return res;
    }

    private void run(String fileLoc) throws IOException, FunconException {
        String fileContent = new String(Files.readAllBytes(Paths.get(fileLoc)));
        System.out.println("== Running: " + fileLoc + " ==");
        // run with a proxy showing all funcons used
//        camllight.algebras.AllAlg<IEval> myalg = () -> new funcons.interpreter.value.RecordFactory() {};
//        eval(fileContent, new Tracer<>(myalg, new Class<?>[] {camllight.algebras.AllAlg.class}).make());
        interpret(fileContent);
    }

    private void runPerformance(String fileLoc, int n) throws IOException, FunconException {
        List<Long> timings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String src = new String(Files.readAllBytes(Paths.get(fileLoc)));
            Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
            funcons.truffle.TruffleAllFactory funconFactory = new funcons.truffle.TruffleAllFactory() {
            };
            camllight.algebras.AllAlg alg = () -> funconFactory;
            CLExecuteNode eval = builder.build(alg);
            // TODO how to execute?
            //IValue env = importStandardLibrary(funconFactory.environment().eval());
            IValue env = null;
            long start = System.currentTimeMillis();
            eval.eval((IMap) env, new Null());
            long end = System.currentTimeMillis();
            timings.add(end - start);
            System.out.println("time taken: " + (end - start));
        }
        System.out.println("fastest time: " + Collections.min(timings));
    }

    private void runAll(String folderLoc) throws IOException, FunconException {
        runAllButExclude(folderLoc, new ArrayList<>());
    }

    private void runAllButExclude(String folderLoc, List<String> fileEndings) throws IOException, FunconException {
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
        funcons.algebras.AllAlg<CLExecuteNode> alg = new funcons.truffle.TruffleAllFactory() {
        };
        StandardLibrary<CLExecuteNode> lib = () -> alg;

        for (Method m : lib.getClass().getMethods()) {
            String methodName = m.getName();
            if (!methodName.endsWith("Fun")) {
                continue;
            }
            methodName = methodName.substring(0, methodName.length() - 3);

            if (excludes.contains(methodName)) {
                continue;
            }

            try {
                final IValue env2 = env;
                final CLExecuteNode invoke = (CLExecuteNode) m.invoke(lib);
                env = alg.mapUnion(
                        (e, g) -> env2,
                        alg.bindValue(alg.id(methodName), invoke)
                ).eval((IMap) env, new Null());
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return env;
    }

    private void runExamples() throws IOException, FunconException {
        run("examples/fib.ml");
        run("examples/sieve.ml");
    }

    private void runGivenTests() throws IOException, FunconException {
        runAll("givenTests/Advanced");
        runAll("givenTests/Basic");
        runAll("givenTests/Equality"); // structural equality on variables fails???
        runAll("givenTests/MuRecTypes");
        runAllButExclude("givenTests/OL", Arrays.asList("OL12.ml", "OL17.ml", "OL25.ml")); // precedence issues in OL5.ml
        runAll("givenTests/PM");
        runAllButExclude("givenTests/Shadowing", Collections.singletonList("Shadowing6.ml")); // shadowing 3 & 6 -> patternmatching on type?
        //runAll("givenTests/Syntax"); // missing the syntactic sugar
        runAll("givenTests/Types");
        runAll("givenTests/Valres");
    }

    private void runPerformanceTests() throws IOException, FunconException {
        //runPerformance("performanceTests/mandelbrot.ml", 10); // FunCaml: Xs, Ocaml: 75.5s, Py: 170.2s
        runPerformance("performanceTests/fib.ml", 10); // FunCaml: 237.8s, Ocaml: 8.1s, FunCamlOnRascal: 247.6s
        runPerformance("performanceTests/ack.ml", 10); // FunCaml: 126.s, Ocaml: 1.4s, FunCamlOnRascal: 188.5s
        runPerformance("performanceTests/harmonic.ml", 10); // FunCaml: 38.7s, Ocaml: 0.2s, FunCamlOnRascal: 7.2s
        runPerformance("performanceTests/tak.ml", 10); // FunCaml: 406.7s, Ocaml: 5.9s
    }


    @Override
    protected FNCContext createContext(Env env) {
        return null;
    }

    @Override
    protected Object getLanguageGlobal(FNCContext context) {
        return null;
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return false;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {

       // interpret("1 + if true then 2 else 2 + 3;;");

        // interpret a FunCaml program given as String



//        interpret("1 + \"a\"");
        // run examples found in the examples folder
           runExamples();

        // run tests as provided by Mosses
        //runGivenTests();

        // run several performance tests
        //runPerformanceTests();


        // useless so far, just to avoir an ugly runtime exception when the execution ends.
        return Truffle.getRuntime().createCallTarget(new CLRootNode(this, null));
    }


}
