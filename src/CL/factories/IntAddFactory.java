package cl.factories;

import cl.algebras.IntAddAlg;
import funcons.algebras.IntCalcAlg;

public interface IntAddFactory<E> extends IntAddAlg<E> {

    IntCalcAlg<E> intCalcAlg();

    @Override
    default E start(E exp) {
        return exp;
    }

    @Override
    default E lit(Integer a) {
        return intCalcAlg().lit(a);
    }

    @Override
    default E add(E a, E b) {
        return intCalcAlg().intAdd(a, b);
    }
}
