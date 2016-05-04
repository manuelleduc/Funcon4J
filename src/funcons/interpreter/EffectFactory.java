package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.carriers.IEval;
import funcons.values.Null;

public interface EffectFactory extends PrintFactory, EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (env, forward, store, given) -> {
            e.eval(env, forward, store, given);
            return new Null();
        };
    }
}
