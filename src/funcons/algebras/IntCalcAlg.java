package funcons.algebras;

public interface IntCalcAlg<T> {
    T lit(java.lang.Integer i);
    T bool(java.lang.Boolean b);

    T add(T a, T b);
    T subtract(T a, T b);
    T multiply(T a, T b);
    T divide(T a, T b);
}
