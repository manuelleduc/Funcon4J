package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;
import funcons.types.Unit;

public interface SeqFactory extends LogicIfTrueFactory, SeqAlg<IEval> {
    @Override
    default IEval seq(IEval c, IEval t) {
        return () -> {
            c.eval();
            return t.eval();
        };
    }
}
