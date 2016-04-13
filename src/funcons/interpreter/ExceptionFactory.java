package funcons.interpreter;

import funcons.algebras.ExceptionAlg;
import funcons.sorts.IEval;
import funcons.types.FailureTrueException;
import funcons.types.FunconException;

public interface ExceptionFactory extends ApplyFactory, ExceptionAlg<IEval> {

    @Override
    default IEval fail() {
        return (env, store, given) -> {
            throw new FailureTrueException();
        };
    }

    @Override
    default IEval throw_(IEval s) {
        return (env, store, given) -> {
            throw (FunconException)s.eval(env, store, given);
        };
    }

    @Override
    default IEval catch_(IEval x, IEval abs) {
        return (env, store, given) -> {
            try {
                return x.eval(env, store, given);
            } catch (FunconException e) {
                return apply(abs, (env1, store1, given1) -> e).eval(env, store, given);
            }
        };
    }

    @Override
    default IEval catchElseRethrow(IEval x, IEval abs) {
        return catch_(x, preferOver(abs, (env, store, given) -> abs(throw_(given)).eval(env, store, given)));
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (env, store, given) -> {
            try {
                return x1.eval(env, store, given);
            } catch(FailureTrueException f) {
                return x2.eval(env, store, given);
            }
        };
    }

    @Override
    default IEval preferOver(IEval a1, IEval a2) {
        return abs(else_(unAbs(a1), unAbs(a2)));
    }
}
