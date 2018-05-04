package funcons.algebras.values;

public interface IntAlg<E> {
    E lit(java.lang.Integer i);

    E intAdd(E a, E b);
    E intNegate(E x);
    E intSubtract(E a, E b);
    E intMultiply(E a, E b);
    E intDivide(E a, E b);
    E intModulo(E a, E b);
}
