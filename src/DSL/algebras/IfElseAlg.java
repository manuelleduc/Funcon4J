package DSL.algebras;

public interface IfElseAlg<E> extends BoolLogicalAndAlg<E> {
    E ifElse(E e1, E e2, E e3);
}
