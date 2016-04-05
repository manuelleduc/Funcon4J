package DSL.algebras;

public interface IfElseAlg<E, S> {
    S ifElse(E e1, S e2, S e3);
}
