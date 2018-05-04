package camllight;

import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.FunconException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.out;

public class CamlLightTruffle {

    public static void main(String[] args) throws IOException, FunconException {

        new CamlLightTruffle().exec();
    }

    private void exec() throws IOException, FunconException {
        //        for (int i = 0; i < 1000000; i++)
//            interpret("1 + if true then 2 else 2 + 3;;");

        // interpret a FunCaml program given as String


//        interpret("1 + \"a\"");
        // run examples found in the examples folder
//        runExamples();

        // run tests as provided by Mosses
        //runGivenTests();

        // run several performance tests
        runPerformanceTests();

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

        BenchTool.timings.clear();
        for (int i = 0; i < n; i++) {
            final String src = new String(Files.readAllBytes(Paths.get(fileLoc)));
            System.out.print('.');
            this.eval(src, true);
        }
        System.out.println("fastest time: " + Collections.min(BenchTool.timings));
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


    private void runExamples() throws IOException, FunconException {
        run("examples/fib.ml");
//        run("examples/p1.ml");
//        run("examples/p2.ml");
//        run("examples/ref.ml");
//        run("examples/if.ml");
//        run("examples/sieve.ml");
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
//        runPerformance("performanceTests/fib.ml", 10); // FunCaml: 237.8s, Ocaml: 8.1s, FunCamlOnRascal: 247.6s
//        runPerformance("performanceTests/ack.ml", 10); // FunCaml: 126.s, Ocaml: 1.4s, FunCamlOnRascal: 188.5s
        runPerformance("performanceTests/harmonic.ml", 10); // FunCaml: 38.7s, Ocaml: 0.2s, FunCamlOnRascal: 7.2s
        runPerformance("performanceTests/tak.ml", 10); // FunCaml: 406.7s, Ocaml: 5.9s
    }


    private void interpret(String src) throws FunconException {
        System.out.println("== Interpreting ==");
        System.out.println(src);
        System.out.println("Print output: ");
        eval(src);
        System.out.println();
        System.out.println();

    }

    public void eval(String src) {
        eval(src, false);
    }

    public void eval(String src, boolean bench) {


        final PolyglotEngine engine = PolyglotEngine.newBuilder().setIn(in).setOut(out).build();
        final Source source = Source.newBuilder(src).mimeType(FNCLanguage.MIME_TYPE).name("ELT").build();
        long start = System.currentTimeMillis();
        engine.eval(source);
        long end = System.currentTimeMillis();
        BenchTool.timings.add(end - start);
        if (bench) System.out.println("time taken: " + (end - start));
        engine.dispose();


    }

    static class BenchTool {
        static final List<Long> timings = new ArrayList<>();
    }

}