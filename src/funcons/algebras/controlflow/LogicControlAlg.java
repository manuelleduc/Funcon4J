package funcons.algebras.controlflow;

public interface LogicControlAlg<E> {
    E effect(E e);
    E seq(E c, E x);
    E ifTrue(E e, E c1, E c2);
    E whileTrue(E e, E c);
    E for_(E id, E startValue, E cond, E incr, E exp);
}
