package funcons.interpreter;

import funcons.algebras.LogicWhileTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Null;
import funcons.types.Unit;

public class LogicWhileTrueFactory extends SeqFactory<Unit> implements LogicWhileTrueAlg<IEval<Bool>, IEval<Unit>> {
    @Override
    public IEval<Unit> whileTrue(IEval<Bool> e, IEval<Unit> c) {
        return ifTrue(
                    e,
                    seq(c, whileTrue(e, c)),
                    Null::new
        );
    }
}
