package funcons.algebras;

public interface IntCalcAlg<E> {
    E lit(java.lang.Integer i);

    E intAdd(E a, E b);
    E intSubtract(E a, E b);
    E intMultiply(E a, E b);
    E intDivide(E a, E b);
}
