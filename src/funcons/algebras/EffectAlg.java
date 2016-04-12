package funcons.algebras;

public interface EffectAlg<E> extends PrintAlg<E> {
    E effect(E e);
}
