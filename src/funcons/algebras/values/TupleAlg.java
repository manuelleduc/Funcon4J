package funcons.algebras.values;

public interface TupleAlg<E> {
    E tuple();
    E tuple(E x);
    E tuple(E x1, E x2);
    E tuple(E x1, E x2, E x3);
    E tuplePrefix(E x, E tup);
    E tupleHead(E tup);
    E tupleTail(E tup);
    E project(E index, E tup);

    E tuplePrefixMatch(E tup, E p1, E p2);
    E tuplePrefixPatt(E p1, E p2);
}
