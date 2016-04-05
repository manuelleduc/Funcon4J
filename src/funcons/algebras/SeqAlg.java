package funcons.algebras;

public interface SeqAlg<E> extends EffectAlg<E> {
    E seq(E c, E x);
}