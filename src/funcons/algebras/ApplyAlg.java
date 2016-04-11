package funcons.algebras;

public interface ApplyAlg<E> extends BindAlg<E> {
    E abs(E exp);
    E apply(E abs, E arg);
    E closure(E x, E environment);
    E close(E abs);
    E bind(E var);
}