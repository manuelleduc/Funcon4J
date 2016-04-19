package camllight.factories;

import camllight.algebras.IntCalcAlg;
import funcons.algebras.ListAlg;

public interface IntCalcFactory<E> extends IntCalcAlg<E> {
    @Override
    default E start(E exp) {
        return exp;
    }

    @Override
    default E lit(Integer a) {
        return alg().lit(a);
    }

    @Override
    default E intAdd(E a, E b) {
        return alg().intAdd(a, b);
    }

    @Override
    default E intMultiply(E a, E b) {
        return alg().intMultiply(a, b);
    }

    @Override
    default E intGreater(E e1, E e2) {
        return alg().intGreater(e1, e2);
    }

    @Override
    default E intSmaller(E e1, E e2) {
        return alg().intSmaller(e1, e2);
    }

    @Override
    default E intGreaterEqual(E e1, E e2) {
        return alg().intGreaterEqual(e1, e2);
    }

    @Override
    default E intSmallerEqual(E e1, E e2) {
        return alg().intSmaller(e1, e2);
    }

    @Override
    default E intEqual(E e1, E e2) {
        return alg().equal(e1, e2);
    }
}