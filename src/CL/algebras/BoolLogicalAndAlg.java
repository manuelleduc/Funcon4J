package cl.algebras;

public interface BoolLogicalAndAlg<E> extends IntMulAlg<E> {

    E bool(java.lang.Boolean b);
    E lAnd(E e1, E e2);
}
