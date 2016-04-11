package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.types.FailureTrueException;
import funcons.types.FunconException;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface ElseFactory extends ApplyFactory, ElseAlg<IEval> {

    @Override
    default IEval equal(IEval x1, IEval x2) { // TODO hacky?
        return (env, given) -> new Bool(x1.eval(env, given).equals(x2.eval(env, given)));
    }

    @Override
    default IEval only(IEval v) {
        return abs(ifTrue(equal(given(), v), (env, given) -> new Environment(), fail()));
    }

    @Override
    default IEval any() {
        return abs((env, given) -> new Environment());
    }

    @Override
    default IEval match(IEval exp, IEval pat) {
        return apply(pat, exp);
    }

    @Override
    default IEval pattAbs(IEval pat, IEval x) {
        return abs(scope(match(given(), pat), x));
    }

    @Override
    default IEval fail() {
        return (env, given) -> {
            throw new FailureTrueException();
        };
    }

    @Override
    default IEval throw_(IEval s) {
        return (env, given) -> {
            throw (FunconException)s.eval(env, given);
        };
    }

    @Override
    default IEval catch_(IEval x, IEval abs) {
        return (env, given) -> {
            try {
                return x.eval(env, given);
            } catch (FunconException e) {
                return apply(abs, (env1, given1) -> e).eval(env, given);
            }
        };
    }

    @Override
    default IEval catchElseRethrow(IEval x, IEval abs) {
        return catch_(x, preferOver(abs,abs(throw_(given()))));
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (env, given) -> {
            try {
                return x1.eval(env, given);
            } catch(FailureTrueException f) {
                return x2.eval(env, given);
            }
        };
    }

    @Override
    default IEval preferOver(IEval a1, IEval a2) {
        return abs(else_(unAbs(a1), unAbs(a2)));
    }
}
