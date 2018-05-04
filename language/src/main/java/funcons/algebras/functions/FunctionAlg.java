package funcons.algebras.functions;

public interface FunctionAlg<E> {
    E abs(E exp);
    E abs(E patt, E exp);
    E apply(E abs, E arg);
    E applyToEach(E a, E l);
    E compose(E f, E g);
    E close(E abs);
    E bind(E id);
}