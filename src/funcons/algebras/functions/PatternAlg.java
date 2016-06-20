package funcons.algebras.functions;

public interface PatternAlg<E> {
    E only(E v);
    E any();
    E match(E exp, E pat);
    E pattAbs(E pat, E x);
    E pattUnion(E pat1, E pat2);
    E pattNonBinding(E pat);
}
