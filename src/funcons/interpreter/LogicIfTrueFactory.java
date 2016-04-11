package funcons.interpreter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;

public interface LogicIfTrueFactory extends SeqFactory, LogicIfTrueAlg<IEval> {

    @Override
    default IEval bool(java.lang.Boolean b) {
        return (env, store, given) -> new Bool(b);
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, store, given) -> (((Bool)e.eval(env, store, given)).boolValue() ? c1 : c2).eval(env, store, given);
    }
}
