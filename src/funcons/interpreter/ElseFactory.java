package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface ElseFactory extends ExceptionFactory, ElseAlg<IEval> {

    @Override
    default IEval equal(IEval x1, IEval x2) {
        return (env, store, given) -> new Bool(x1.eval(env, store, given).equals(x2.eval(env, store, given)));
    }

    @Override
    default IEval only(IEval v) {
        return abs(ifTrue(equal(given(), v), (env, store, given) -> new Environment(), fail()));
    }

    @Override
    default IEval any() {
        return abs((env, store, given) -> new Environment());
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
    default IEval pattUnion(IEval pat1, IEval pat2) {
        return abs((env, store, given) -> {
            Environment env1 = (Environment)unAbs(pat1).eval(env, store, given);
            Environment env2 = (Environment)unAbs(pat2).eval(env, store, given);
            return env1.extend(env2);
        });
    }

    @Override
    default IEval pattNonBinding(IEval patt) {
        return (env, store, given) -> {
            patt.eval(env, store, given);
            return new Environment();
        };
    }
}
