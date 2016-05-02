package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.values.*;
import funcons.values.recursion.Forwards;

public interface IntCalcFactory extends NullFactory, IntCalcAlg<IEval> {
    @Override
    default IEval lit(java.lang.Integer i) {
        return (env, forward, store, given) -> new Int(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(((Int)a.eval(env, forward, store, given)).intValue() + ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, forward, store, given) -> new Int(-((Int)x.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(((Int)a.eval(env, forward, store, given)).intValue() - ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(((Int)a.eval(env, forward, store, given)).intValue() * ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(((Int)a.eval(env, forward, store, given)).intValue() / ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intModulo(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(((Int)a.eval(env, forward, store, given)).intValue() % ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intGreater(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(((Int)a.eval(env, forward, store, given)).intValue() > ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSmaller(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(((Int)a.eval(env, forward, store, given)).intValue() < ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intGreaterEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(((Int)a.eval(env, forward, store, given)).intValue() >= ((Int)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSmallerEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(((Int)a.eval(env, forward, store, given)).intValue() <= ((Int)b.eval(env, forward, store, given)).intValue());
    }


}
