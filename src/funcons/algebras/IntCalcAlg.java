package funcons.algebras;

public interface IntCalcAlg<E> extends NullAlg<E> {
    E lit(java.lang.Integer i);

    E intAdd(E a, E b);
    E intNegate(E x);
    E intSubtract(E a, E b);
    E intMultiply(E a, E b);
    E intDivide(E a, E b);
    E intModulo(E a, E b);

    E intGreater(E a, E b);
    E intSmaller(E a, E b);
    E intGreaterEqual(E a, E b);
    E intSmallerEqual(E a, E b);
}
