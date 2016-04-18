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
    default E add(E a, E b) {
        return alg().intAdd(a, b);
    }

    @Override
    default E multiply(E a, E b) {
        return alg().intMultiply(a, b);
    }
}
