package funcons.interpreter;

import funcons.algebras.NullAlg;
import funcons.sorts.IEval;
import funcons.types.Null;

public interface NullFactory extends NullAlg<IEval> {

    @Override
    default IEval null_() {
        return (env, store, given) -> new Null();
    }
}
