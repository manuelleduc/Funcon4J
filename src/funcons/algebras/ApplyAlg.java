package funcons.algebras;

public interface ApplyAlg<E> extends BindAlg<E> {
    E abs(E exp);
    E abs(E patt, E exp); // TODO is this correct?
    E apply(E abs, E arg);
    E scopeInner(E patt, E f); // TODO write test
    E compose(E f, E g);
    E closure(E x, E environment);
    E close(E abs);
    E bind(E id);
}