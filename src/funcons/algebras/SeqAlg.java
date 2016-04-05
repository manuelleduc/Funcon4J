package funcons.algebras;

import funcons.sorts.IEval;

public interface SeqAlg<C, X> {
    IEval<X> seq(IEval<C> c, IEval<X> x);
}