package funcons.algebras.types;

public interface TupleTypeAlg<E> {
    E tupleType();
    E tupleType(E x);
    E tupleType(E x1, E x2);
    E tupleType(E x1, E x2, E x3);
    E tupleTypePrefix(E x, E tup);
    E projectType(E index, E tup);
}
