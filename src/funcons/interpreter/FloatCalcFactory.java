package funcons.interpreter;

import funcons.algebras.FloatCalcAlg;
import funcons.carriers.IEval;
import funcons.values.Bool;
import funcons.values.Float;
import funcons.values.Number;

public interface FloatCalcFactory extends IntCalcFactory, FloatCalcAlg<IEval> {
    @Override
    default IEval lit(Double d) {
        return (env, forwards, store, given) -> new Float(d);
    }

    @Override
    default IEval floatAdd(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Float(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                +
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatNegate(IEval x) {
        return (env, forwards, store, given) ->
                new Float(-((Number)x.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatSubtract(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Float(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                -
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatMultiply(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Float(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                *
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatDivide(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Float(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                /
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatModulo(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Float(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                %
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatGreater(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                >
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatSmaller(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                <
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatGreaterEqual(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                >=
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatSmallerEqual(IEval a, IEval b) {
        return (env, forwards, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forwards, store, given)).floatValue()
                                <=
                        ((Number)b.eval(env, forwards, store, given)).floatValue());
    }
}
