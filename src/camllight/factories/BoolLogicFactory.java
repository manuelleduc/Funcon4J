package camllight.factories;

import camllight.algebras.BoolLogicAlg;

public interface BoolLogicFactory<E> extends BoolLogicAlg<E>, IntCalcFactory<E>, camllight.algebras.IntCalcAlg<E> {
    default E bool(java.lang.Boolean b) {
        return alg().bool(b);
    }

    default E lAnd(E e1, E e2) {
        return alg().ifTrue(e1, e2, bool(false));
    }

    default E lOr(E e1, E e2) {
        return alg().ifTrue(e1, bool(true), e2);
    }
}
