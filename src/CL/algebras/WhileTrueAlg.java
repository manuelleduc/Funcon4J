package cl.algebras;

public interface WhileTrueAlg<E> extends IfElseAlg<E> {
    E whileTrue(E e, E c);
}
