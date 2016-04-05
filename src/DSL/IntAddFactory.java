package DSL;

import DSL.algebras.IntAddAlg;
import funcons.algebras.IntCalcAlg;

public class IntAddFactory<T> implements IntAddAlg<T> {

    private IntCalcAlg<T> funconAlg;

    public IntAddFactory(IntCalcAlg<T> funconAlgebra) {
        funconAlg = funconAlgebra;
    }

    public T lit(Integer a) {
        return funconAlg.lit(a);
    }

    public T add(T a, T b) {
        return funconAlg.add(a, b);
    }
}
