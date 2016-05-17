package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.carriers.IEval;
import funcons.values.Number;
import funcons.values.Bool;
import funcons.values.Int;

public interface IntCalcFactory extends NullFactory, IntCalcAlg<IEval> {
    @Override
    default IEval lit(java.lang.Integer i) {
        return (env, forward, store, given) -> new Int(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                +
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, forward, store, given) ->
                new Int(-((Number)x.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                -
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                *
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                /
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intModulo(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Int(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                %
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intGreater(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                >
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSmaller(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                <
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intGreaterEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                >=
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }

    @Override
    default IEval intSmallerEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).intValue()
                                <=
                        ((Number)b.eval(env, forward, store, given)).intValue());
    }


}
