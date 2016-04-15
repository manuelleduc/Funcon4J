package camllight.factories;

import camllight.algebras.BoolLogicalAndAlg;
import funcons.algebras.LogicIfTrueAlg;

public interface BoolLogicalAndFactory<E> extends IntMulFactory<E>, BoolLogicalAndAlg<E> {
    LogicIfTrueAlg<E> ifTrueAlg();

    default E bool(java.lang.Boolean b) {
        return ifTrueAlg().bool(b);
    }

    default E lAnd(E e1, E e2) {
        return ifTrueAlg().ifTrue(e1, e2, bool(false));
    }
}
