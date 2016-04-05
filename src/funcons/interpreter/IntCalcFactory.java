package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Int;

public interface IntCalcFactory extends IntCalcAlg<IEval> {

    @Override
    default IEval lit(java.lang.Integer i) {
        return () -> new Int(i);
    }

    @Override
    default IEval bool(java.lang.Boolean b) {
        return () -> new Bool(b);
    }

    @Override
    default IEval add(IEval a, IEval b) {
        return () -> new Int(((Int)a.eval()).intValue() + ((Int)b.eval()).intValue());
    }

    @Override
    default IEval subtract(IEval a, IEval b) {
        return () -> new Int(((Int)a.eval()).intValue() - ((Int)b.eval()).intValue());
    }

    @Override
    default IEval multiply(IEval a, IEval b) {
        return () -> new Int(((Int)a.eval()).intValue() * ((Int)b.eval()).intValue());
    }

    @Override
    default IEval divide(IEval a, IEval b) {
        return () -> new Int(((Int)a.eval()).intValue() / ((Int)b.eval()).intValue());
    }
}
