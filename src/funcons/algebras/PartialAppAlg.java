package funcons.algebras;

public interface PartialAppAlg<E> extends AssignAlg<E> {
    E tuple();
    E tuple(E x);
    E tuple(E x1, E x2);
    E tuple(E x1, E x2, E x3);
    E project(E index, E tup);
    E partialApp(E abs, E x);
}
