package funcons.interpreter.functions;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.values.BoolAlg;
import funcons.carriers.IEval;
import funcons.values.Abs;
import funcons.values.Environment;

public interface PatternFactory extends
        BoolAlg<IEval>,
        LogicControlAlg<IEval>,
        SupplyGivenAlg<IEval>,
        FunctionAlg<IEval>,
        ExceptionAlg<IEval>,
        EnvironmentAlg<IEval>,
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
    @SuppressWarnings("unchecked")
    default IEval pattUnion(IEval pat1, IEval pat2) {
        return abs((env, forward, store, given) -> {
            Environment env1 = (Environment)((Abs<IEval>)pat1.eval(env, forward, store, given)).body().eval(env, forward, store, given);
            Environment env2 = (Environment)((Abs<IEval>)pat2.eval(env, forward, store, given)).body().eval(env, forward, store, given);
            return env1.join(env2);
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval pattNonBinding(IEval patt) {
        return abs((env, forward, store, given) -> {
            ((Abs<IEval>)patt.eval(env, forward, store, given)).body().eval(env, forward, store, given);
            return new Environment();
        });
    }
}
