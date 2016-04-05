package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Int;
import funcons.types.Number;

public class IntCalcFactory implements IntCalcAlg<IEval<Number>> {

    @Override
    public IEval<Number> lit(java.lang.Integer i) {
        return () -> new Int(i);
    }

    @Override
    public IEval<Number> bool(java.lang.Boolean b) {
        return () -> new Bool(b);
    }

    @Override
    public IEval<Number> add(IEval<Number> a, IEval<Number> b) {
        return () -> new Int(a.eval().intValue() + b.eval().intValue());
    }

    @Override
    public IEval<Number> subtract(IEval<Number> a, IEval<Number> b) {
        return () -> new Int(a.eval().intValue() - b.eval().intValue());
    }

    @Override
    public IEval<Number> multiply(IEval<Number> a, IEval<Number> b) {
        return () -> new Int(a.eval().intValue() * b.eval().intValue());
    }

    @Override
    public IEval<Number> divide(IEval<Number> a, IEval<Number> b) {
        return () -> new Int(a.eval().intValue() / b.eval().intValue());
    }
}
