package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.values.Null;

public interface EffectFactory extends PrintFactory, EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (env, store, given) -> {
            e.eval(env, store, given);
            return new Null();
        };
    }
}
