package funcons.interpreter;

import funcons.algebras.BoolAlg;
import funcons.carriers.IEval;
import funcons.values.Bool;
import funcons.values.Number;

public interface BoolFactory extends FloatCalcFactory, BoolAlg<IEval> {
    @Override
    default IEval bool(java.lang.Boolean b) {
        return (env, forward, store, given) -> new Bool(b);
    }

    @Override
    default IEval not(IEval bool) {
        return (env, forward, store, given) -> new Bool(!((Bool)bool.eval(env, forward, store, given)).boolValue());
    }


    @Override
    default IEval greater(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).greaterThan(
                            ((Number)b.eval(env, forward, store, given))));
    }

    @Override
    default IEval smaller(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).smallerThan(
                                ((Number)b.eval(env, forward, store, given))));
    }

    @Override
    default IEval greaterEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).greaterEqualThan(
                                ((Number)b.eval(env, forward, store, given))));
    }

    @Override
    default IEval smallerEqual(IEval a, IEval b) {
        return (env, forward, store, given) ->
                new Bool(
                        ((Number)a.eval(env, forward, store, given)).smallerEqualThan(
                                ((Number)b.eval(env, forward, store, given))));
    }
}
