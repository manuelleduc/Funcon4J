package camllight;

import camllight.algebras.exprs.ExpControlAlg;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;

import funcons.Store;
import funcons.algebras.AllAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.FunconException;
import funcons.types.Null;

import noa.proxy.Union;
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

    private static void testBuilder(String src) throws FunconException {
        System.out.println("## Using builder");
        Recorder builder = parse(src, Recorder.create(camllight.algebras.AllAlg.class));
        IEval eval = builder.build(new camllight.algebras.AllAlg<IEval>() {
            @Override
            public funcons.algebras.ListAlg<IEval> alg() {
                return new funcons.interpreter.ListFactory() {};
            }
        });
        System.out.println("eval " + src + " = " + eval.eval(new Environment(), new Store(), new Null()));
    }

    public static void main(String[] args) {
        try {
            testBuilder("(print 10) ; begin if 7 < 3 then 1 else 2 + 3 end = 5");
            testBuilder("not false or true");
        } catch (FunconException e) {
            e.printStackTrace();
        }
    }
}

