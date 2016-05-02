package funcons.interpreter;

import funcons.algebras.NullAlg;
import funcons.sorts.IEval;
import funcons.values.Null;

public interface NullFactory extends NullAlg<IEval> {

    @Override
    default IEval null_() {
        return (env, forward, store, given) -> new Null();
    }
}
