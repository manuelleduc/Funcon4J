package DSL;

import DSL.algebras.IntAddAlg;
import funcons.algebras.IntCalcAlg;

public interface IntAddFactory<E> extends IntAddAlg<E> {

    IntCalcAlg<E> intCalcAlg();

    default E lit(Integer a) {
        return intCalcAlg().lit(a);
    }

    default E add(E a, E b) {
        return intCalcAlg().add(a, b);
    }
}
