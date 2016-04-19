package camllight.algebras.exprs;

public interface FunctionAlg<E> extends ExpControlAlg {
    E match(E f, E e1);
}
