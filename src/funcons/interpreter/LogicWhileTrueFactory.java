package funcons.interpreter;

import funcons.algebras.LogicWhileTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Null;

public interface LogicWhileTrueFactory extends LogicIfTrueFactory, LogicWhileTrueAlg<IEval> {
    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return ifTrue(
                    e,
                    seq(c, (env, given) -> whileTrue(e, c).eval(env, given)),
                    (env, given) -> new Null()
        );
    }
}
