package camllight;

import camllight.parser.CLLexer;
import camllight.parser.CLParser;

import funcons.Store;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.signals.FunconException;
import funcons.types.Null;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import noa.proxy.Recorder;

public class CamlLightDemo {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <X> X parse(String s, camllight.algebras.AllAlg alg) {
        CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    private static void interpret(String src) throws FunconException {
        System.out.println("== Interpreting ==");
        Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
        IEval eval = builder.build((camllight.algebras.AllAlg<IEval>) () -> new funcons.interpreter.ListFactory() {});
        System.out.println(src);
        System.out.print("Print output: ");
        funcons.types.Value result = eval.eval(new Environment(), new Store(), new Null());
        System.out.println();
        System.out.println("Result: " + result);
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            interpret("let test = function | 0 as y -> y + 1 | _ -> 0 in test 0");
            interpret("let isZero = fun x -> match x with | 0 -> true | _ -> false and x = 0 in isZero x");
            interpret("let t = (1,2) and add = fun (x,y) -> x + y in add t");
            interpret("let x = 3 in x + 1");
            interpret("let x = 3 in fun y -> y + x 4");
            interpret("let x = 3 in let y = 5 in x + y");
            interpret("(fun a ((b,c), d) -> a + b + c + d) 1 ((2,3),4)");
            interpret("function | 1 -> 4 | 2 -> 5 | 3 -> 6 | _ -> 0 2");
            interpret("(fun a b c d e f -> a + b + c + d + e + f) 1 2 3 4 5 6");
            interpret("1");
            interpret("for i = 10 downto 1 do print i done");
            interpret("(print 10) ; begin if 7 < 3 then 1 else 2 + 3 end = 5");
            interpret("not false or true");
        } catch (FunconException e) {
            e.printStackTrace();
        }
    }
}