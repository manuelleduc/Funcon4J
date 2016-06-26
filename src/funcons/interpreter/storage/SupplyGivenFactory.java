package funcons.interpreter.storage;

import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;

public interface SupplyGivenFactory extends SupplyGivenAlg<IEval> {
    @Override
    default IEval given() {
        return (env, store, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, store, given) -> x.eval(env, store, exp.eval(env, store, given));
    }
}
