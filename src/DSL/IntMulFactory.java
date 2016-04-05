package DSL;

import DSL.algebras.IntMulAlg;
import funcons.algebras.IntCalcAlg;

public class IntMulFactory<T> extends IntAddFactory<T> implements IntMulAlg<T> {

    private IntCalcAlg<T> funconAlg;

    public IntMulFactory(IntCalcAlg<T> funconAlgebra) {
        super(funconAlgebra);
        funconAlg = funconAlgebra;
    }

    public T multiply(T a, T b) {
        return funconAlg.multiply(a, b);
    }
}