package DSL;

import DSL.algebras.IntMulAlg;
import funcons.algebras.IntCalcAlg;

public interface IntMulFactory<E> extends IntAddFactory<E>, IntMulAlg<E> {

    IntCalcAlg<E> funconAlg();

    default E multiply(E a, E b) {
        return funconAlg().multiply(a, b);
    }
}