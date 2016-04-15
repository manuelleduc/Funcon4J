package cl;

import cl.factories.IntAddFactory;
import cl.parser.CLLexer;
import cl.parser.CLParser;

import funcons.Store;
import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.FunconException;
import funcons.types.Null;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import noa.proxy.Recorder;
import noa.proxy.Union;

public class Demo {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <X> X parse(String s, cl.algebras.IntAddAlg alg) {
        CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    private static void testBuilder(String src) throws FunconException {
        System.out.println("## Using builder");
        Recorder builder = parse(src, Recorder.create(cl.algebras.IntAddAlg.class));
        IEval eval = builder.build(Union.union(cl.algebras.IntAddAlg.class, new IntAddFactory<IEval>() {
            @Override
            public IntCalcAlg<IEval> intCalcAlg() {
                return new funcons.interpreter.IntCalcFactory() {};
            }
        }));
        System.out.println("eval " + src + " = " + eval.eval(new Environment(), new Store(), new Null()));
    }

    public static void main(String[] args) {
        try {
            testBuilder("2 + 1 + 3");
        } catch (FunconException e) {
            e.printStackTrace();
        }
    }
}

