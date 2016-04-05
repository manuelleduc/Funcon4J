package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;

public interface SeqFactory extends EffectFactory, SeqAlg<IEval> {
    @Override
    default IEval seq(IEval c, IEval t) {
        return () -> {
            c.eval();
            return t.eval();
        };
    }
}
