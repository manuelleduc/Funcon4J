package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.values.Null;
import funcons.values.recursion.Forwards;

public interface EffectFactory extends PrintFactory, EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (env, forward, store, given) -> {
            e.eval(env, forward, store, given);
            return new Null();
        };
    }
}
