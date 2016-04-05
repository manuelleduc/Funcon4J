package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.types.Null;

public interface EffectFactory extends EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return Null::new;
    }
}
