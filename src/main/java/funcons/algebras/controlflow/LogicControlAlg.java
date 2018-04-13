package funcons.algebras.controlflow;

public interface LogicControlAlg<E> {
    E effect(E e);

    /*
    The computation $seq(Comm,X)$ first evaluates $Comm$, and then $X$ is evaluated to a result.
     */
    E seq(E c, E x);

    E ifTrue(E e, E c1, E c2);

    E whileTrue(E e, E c);

    E for_(E cond, E incr, E exp);
}
