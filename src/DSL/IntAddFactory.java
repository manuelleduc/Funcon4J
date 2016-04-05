package DSL;

import DSL.algebras.IntAddAlg;
import funcons.algebras.IntCalcAlg;

public interface IntAddFactory<E> extends IntAddAlg<E> {

    IntCalcAlg<E> funconAlg();

    default E lit(Integer a) {
        return funconAlg().lit(a);
    }

    default E add(E a, E b) {
        return funconAlg().add(a, b);
    }
}
