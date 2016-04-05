package funcons.interpreter;

import funcons.algebras.LogicWhileTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Null;

public interface LogicWhileTrueFactory extends SeqFactory, LogicWhileTrueAlg<IEval> {
    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return ifTrue(
                    e,
                    seq(c, () -> whileTrue(e, c).eval()),
                    Null::new
        );
    }
}
