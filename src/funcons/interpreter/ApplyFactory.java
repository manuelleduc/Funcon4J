package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return supply(arg, abs);
    }
}
