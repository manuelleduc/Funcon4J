package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface ElseFactory extends ExceptionFactory, ElseAlg<IEval> {

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
}
