package funcons.interpreter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface LogicIfTrueFactory extends SeqFactory, LogicIfTrueAlg<IEval> {

    @Override
    default IEval bool(java.lang.Boolean b) {
        return (env, given) -> new Bool(b);
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, given) -> (((Bool)e.eval(env, given)).boolValue() ? c1 : c2).eval(env, given);
    }
}
