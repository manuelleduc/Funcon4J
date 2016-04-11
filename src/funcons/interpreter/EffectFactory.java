package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.types.Null;

public interface EffectFactory extends IntCalcFactory, EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (env, given) -> {
            e.eval(env, given);
            return new Null();
        };
    }
}
