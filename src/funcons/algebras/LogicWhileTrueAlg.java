package funcons.algebras;

public interface LogicWhileTrueAlg<E> extends LogicIfTrueAlg<E> {
    E whileTrue(E e, E c);
}
