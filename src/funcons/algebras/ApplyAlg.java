package funcons.algebras;

public interface ApplyAlg<E> extends BindAlg<E> {
    E abs(E exp);
    E apply(E abs, E arg);
    E match(E exp, E pat);
    E bind(E var);
    E pattAbs(E pat, E x);
}