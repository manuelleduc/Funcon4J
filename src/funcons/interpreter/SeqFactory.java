package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;
import funcons.types.Unit;

public class SeqFactory<T> extends LogicIfTrueFactory<T> implements SeqAlg<Unit, T> {
    @Override
    public IEval<T> seq(IEval<Unit> c, IEval<T> t) {
        return () -> {
            c.eval();
            return t.eval();
        };
    }
}
