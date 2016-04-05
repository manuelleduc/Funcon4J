package funcons.algebras;

public interface IntCalcAlg<E> {
    E lit(java.lang.Integer i);
    E bool(java.lang.Boolean b);

    E add(E a, E b);
    E subtract(E a, E b);
    E multiply(E a, E b);
    E divide(E a, E b);
}
