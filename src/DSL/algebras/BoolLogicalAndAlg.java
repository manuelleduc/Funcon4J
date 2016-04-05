package DSL.algebras;

public interface BoolLogicalAndAlg<T> {
    T bool(java.lang.Boolean b);
    T lAnd(T e1, T e2);
}
