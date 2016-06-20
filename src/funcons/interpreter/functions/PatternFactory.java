package funcons.interpreter.functions;

import funcons.algebras.functions.PatternAlg;
import funcons.carriers.IEval;
import funcons.interpreter.controlflow.ExceptionFactory;
import funcons.interpreter.controlflow.LogicControlFactory;
import funcons.interpreter.storage.SupplyGivenFactory;
import funcons.interpreter.values.BoolFactory;
import funcons.values.Environment;

public interface PatternFactory extends
        BoolFactory,
        LogicControlFactory,
        SupplyGivenFactory,
        FunctionFactory,
        ExceptionFactory,
        PatternAlg<IEval> {

    @Override
    default IEval only(IEval v) {
        return abs(ifTrue(equal(given(), v), (env, forward, store, given) -> new Environment(), fail()));
    }

    @Override
    default IEval any() {
        return abs((env, forward, store, given) -> new Environment());
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
        return abs((env, forward, store, given) -> {
            Environment env1 = (Environment)unAbs(pat1, env, forward, store, given).eval(env, forward, store, given);
            Environment env2 = (Environment)unAbs(pat2, env, forward, store, given).eval(env, forward, store, given);
            return env1.extend(env2);
        });
    }

    @Override
    default IEval pattNonBinding(IEval patt) {
        return abs((env, forward, store, given) -> {
            unAbs(patt, env, forward, store, given).eval(env, forward, store, given);
            return new Environment();
        });
    }
}
