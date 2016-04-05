package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.types.Null;
import funcons.types.Unit;

public class EffectFactory implements EffectAlg<Unit> {

    @Override
    public IEval<Unit> effect(IEval<Unit> e) {
        return Null::new;
    }
}
