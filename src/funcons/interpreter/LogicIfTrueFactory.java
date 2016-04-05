package funcons.interpreter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;

public interface LogicIfTrueFactory extends SeqFactory, LogicIfTrueAlg<IEval> {

    @Override
    default IEval bool(java.lang.Boolean b) {
        return () -> new Bool(b);
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return () -> (((Bool)e.eval()).boolValue() ? c1 : c2).eval();
    }
}
