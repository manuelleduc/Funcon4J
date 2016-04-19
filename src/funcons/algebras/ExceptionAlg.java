package funcons.algebras;

public interface ExceptionAlg<E> extends ApplyAlg<E> {
    E fail();
    E matchFailure();
    E throw_(E exception);
    E catch_(E x, E abs);
    E catchElseRethrow(E x, E abs);
    E else_(E x1, E x2);
    E preferOver(E a1, E a2);
}
