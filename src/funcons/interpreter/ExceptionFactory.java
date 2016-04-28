package funcons.interpreter;

import funcons.algebras.ExceptionAlg;
import funcons.sorts.IEval;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.MatchFailureException;
import funcons.values.signals.RunTimeFunconException;

public interface ExceptionFactory extends ApplyFactory, ExceptionAlg<IEval> {

    @Override
    default IEval fail() {
        return (env, store, given) -> {
            throw new FailureTrue();
        };
    }

    @Override
    default IEval matchFailure() {
        return (env, store, given) -> new MatchFailureException();
    }

    @Override
    default IEval throw_(IEval s) {
        return (env, store, given) -> {
            throw (RunTimeFunconException)s.eval(env, store, given);
        };
    }

    @Override
    default IEval catch_(IEval x, IEval abs) {
        return (env, store, given) -> {
            try {
                return x.eval(env, store, given);
            } catch (RunTimeFunconException e) {
                return apply(abs, (env1, store1, given1) -> e).eval(env, store, given);
            }
        };
    }

    @Override
    default IEval catchElseRethrow(IEval x, IEval abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (env, store, given) -> {
            try {
                return x1.eval(env, store, given);
            } catch(FailureTrue f) {
                return x2.eval(env, store, given);
            }
        };
    }

    @Override
    default IEval preferOver(IEval a1, IEval a2) {
        return (env, store, given) -> abs(else_(unAbs(a1, env, store, given), unAbs(a2, env, store, given))).eval(env, store, given);
    }
}
