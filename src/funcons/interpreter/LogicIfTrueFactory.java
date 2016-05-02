package funcons.interpreter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.sorts.IEval;
import funcons.values.Bool;
import funcons.values.recursion.Forwards;

public interface LogicIfTrueFactory extends SeqFactory, LogicIfTrueAlg<IEval> {

    @Override
    default IEval bool(java.lang.Boolean b) {
        return (env, forward, store, given) -> new Bool(b);
    }

    @Override
    default IEval not(IEval bool) {
        return (env, forward, store, given) -> new Bool(!((Bool)bool.eval(env, forward, store, given)).boolValue());
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, forward, store, given) ->
                (((Bool)e.eval(env, forward, store, given)).boolValue() ? c1 : c2).eval(env, forward, store, given);
    }
}
