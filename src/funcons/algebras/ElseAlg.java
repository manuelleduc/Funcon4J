package funcons.algebras;

public interface ElseAlg<E> extends ExceptionAlg<E> {
    E equal(E x1, E x2);
    E only(E v);
    E any();
    E whenTrue(E exp, E x);
    E compose(E f, E g);
    E match(E exp, E pat);
    E pattAbs(E pat, E x);
    E pattUnion(E pat1, E pat2);
    E pattNonBinding(E pat);
}
