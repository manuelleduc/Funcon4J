package funcons.interpreter;

import funcons.algebras.PolyTypeAlg;
import funcons.sorts.IEval;

public interface PolyTypeFactory extends TypeFactory, PolyTypeAlg<IEval> {

    @Override
    default IEval instantiatePoly(IEval x) {
        return x;
    }

    @Override
    default IEval instantiateIfPoly(IEval x) {
        return x;
    }
}
