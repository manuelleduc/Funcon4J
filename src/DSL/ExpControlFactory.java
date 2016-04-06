package DSL;

import DSL.algebras.WhileTrueAlg;
import funcons.algebras.LogicWhileTrueAlg;

public interface ExpControlFactory<E> extends BoolLogicalAndFactory<E>, WhileTrueAlg<E> {
    LogicWhileTrueAlg<E> whileTrueAlg();

    @Override
    default E ifElse(E e1, E e2, E e3) {
        return ifTrueAlg().ifTrue(e1, e2, e3);
    }

    @Override
    default E whileTrue(E e, E c) {
        return whileTrueAlg().whileTrue(e, whileTrueAlg().effect(c));
    }
}
