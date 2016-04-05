package DSL;

import DSL.algebras.IfElseAlg;
import DSL.algebras.WhileTrueAlg;
import funcons.algebras.LogicIfTrueAlg;
import funcons.algebras.LogicWhileTrueAlg;

public class ExpControlFactory<E, S, C> implements IfElseAlg<E, S>, WhileTrueAlg<E, C> {
    private final LogicIfTrueAlg<E, S> ifTrueAlg;
    private final LogicWhileTrueAlg<E, C> whileTrueAlg;

    public ExpControlFactory(LogicIfTrueAlg<E, S> ifTrueAlg, LogicWhileTrueAlg<E, C> whileTrueAlg) {
        this.ifTrueAlg = ifTrueAlg;
        this.whileTrueAlg = whileTrueAlg;
    }

    public S ifElse(E e1, S e2, S e3) {
        return ifTrueAlg.ifTrue(e1, e2, e3);
    }

    @Override
    public C whileTrue(E e, C c) {
        return whileTrueAlg.whileTrue(e, c);
    }
}
