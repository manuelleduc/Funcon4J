package funcons.algebras;

public interface LogicIfTrueAlg<E> extends SeqAlg<E> {
    E bool(java.lang.Boolean b);
    E not(E b);

    E ifTrue(E e, E c1, E c2);
}
