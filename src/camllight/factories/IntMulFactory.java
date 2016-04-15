package camllight.factories;

import camllight.algebras.IntMulAlg;
import funcons.algebras.IntCalcAlg;

public interface IntMulFactory<E> extends IntAddFactory<E>, IntMulAlg<E> {

    IntCalcAlg<E> intCalcAlg();

    default E multiply(E a, E b) {
        return intCalcAlg().intMultiply(a, b);
    }
}