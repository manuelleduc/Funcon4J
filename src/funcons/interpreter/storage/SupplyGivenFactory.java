package funcons.interpreter.storage;

import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;

public interface SupplyGivenFactory extends SupplyGivenAlg<IEval> {
    @Override
    default IEval given() {
        return (env, forward, store, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, forward, store, given) -> x.eval(env, forward, store, exp.eval(env, forward, store, given));
    }
}
