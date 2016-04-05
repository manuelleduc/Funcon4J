package funcons.algebras;

public interface EffectAlg<E> extends IntCalcAlg<E> {
    E effect(E e);
}
