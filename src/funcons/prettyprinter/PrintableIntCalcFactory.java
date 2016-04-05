package funcons.prettyprinter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.String;

public class PrintableIntCalcFactory implements IntCalcAlg<IEval<String>> {

    @Override
    public IEval<String> lit(Integer i) {
        return () -> new String(i);
    }

    @Override
    public IEval<String> bool(Boolean b) {
        return () -> new String(b);
    }

    @Override
    public IEval<String> add(IEval<String> a, IEval<String> b) {
        return binaryOp(a, b, "+");
    }

    @Override
    public IEval<String> subtract(IEval<String> a, IEval<String> b) {
        return binaryOp(a, b, "-");
    }

    @Override
    public IEval<String> multiply(IEval<String> a, IEval<String> b) {
        return binaryOp(a, b, "*");
    }

    @Override
    public IEval<String> divide(IEval<String> a, IEval<String> b) {
        return binaryOp(a, b, "/");
    }

    private IEval<String> binaryOp(IEval<String> a, IEval<String> b, java.lang.String op) {
        return () -> new String("(" + a.eval().stringValue() + " " + op + " " + b.eval().stringValue() + ")");
    }
}
