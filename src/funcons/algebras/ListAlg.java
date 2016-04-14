package funcons.algebras;

public interface ListAlg<E> extends TupleAlg<E> {
    E list();
    E list(E x);
    E list(E x1, E x2);
    E listPrefix(E x, E l);
}
