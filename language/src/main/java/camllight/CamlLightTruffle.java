package camllight;

import bench.BenchTool;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;

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

    public static void main(String[] args) throws IOException {

        new CamlLightTruffle().exec();
    }



    private void exec() throws IOException {
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

    private void run(String fileLoc) throws IOException {
        String fileContent = new String(Files.readAllBytes(Paths.get(fileLoc)));
        System.out.println("== Running: " + fileLoc + " ==");
        // run with a proxy showing all funcons used
//        camllight.algebras.AllAlg<IEval> myalg = () -> new funcons.interpreter.value.RecordFactory() {};
//        eval(fileContent, new Tracer<>(myalg, new Class<?>[] {camllight.algebras.AllAlg.class}).make());
        interpret(fileContent);
    }

    private void runPerformance(String fileLoc, int n) throws IOException {

        BenchTool.timings.clear();
        // 20 *
        /*
        let loop n =
	for i = 0 to n do
		((print_int (fib 30)); (print_newline ()))
	done;;

loop 100;;
         */
        for (int i = 0; i < n; i++) {
            final String src = new String(Files.readAllBytes(Paths.get(fileLoc)));
            System.out.print('.');
            this.eval(src, true);
        }
//        System.out.println("fastest time: " + Collections.min(BenchTool.timings));
        System.out.println("Timez");
        BenchTool.timings.forEach(System.out::println);
    }

    private void runAll(String folderLoc) throws IOException {
        runAllButExclude(folderLoc, new ArrayList<>());
    }

    private void runAllButExclude(String folderLoc, List<String> fileEndings) throws IOException {
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


    private void runExamples() throws IOException {
        run("examples/fib.ml");
//        run("examples/p1.ml");
//        run("examples/p2.ml");
//        run("examples/ref.ml");
//        run("examples/if.ml");
//        run("examples/sieve.ml");
    }

    private void runGivenTests() throws IOException {
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

    private void runPerformanceTests() throws IOException {
        //runPerformance("performanceTests/mandelbrot.ml", 10); // FunCaml: Xs, Ocaml: 75.5s, Py: 170.2s
        runPerformance("performanceTests/fib.ml", 50); // FunCaml: 237.8s, Ocaml: 8.1s, FunCamlOnRascal: 247.6s, Truffle: 99.27s
//        runPerformance("performanceTests/ack.ml", 10); // FunCaml: 126.s, Ocaml: 1.4s, FunCamlOnRascal: 188.5s
//        runPerformance("performanceTests/harmonic.ml", 10); // FunCaml: 38.7s, Ocaml: 0.2s, FunCamlOnRascal: 7.2s
//        runPerformance("performanceTests/tak.ml", 10); // FunCaml: 406.7s, Ocaml: 5.9s
    }


    private void interpret(String src) {
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

        BenchTool.setBench(bench);
        Context context = Context.newBuilder().in(in).out(out).build();

        try {
            context.eval(Source.newBuilder("fnc", src, "eval").build());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}