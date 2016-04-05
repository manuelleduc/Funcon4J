package funcons.algebras;

import funcons.sorts.IEval;
import funcons.types.Unit;

public interface EffectAlg<E> {
    IEval<Unit> effect(IEval<E> e);
}
