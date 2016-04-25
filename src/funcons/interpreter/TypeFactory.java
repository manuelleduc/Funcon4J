package funcons.interpreter;

import funcons.algebras.TypeAlg;
import funcons.sorts.IEval;
import funcons.types.Type;

public interface TypeFactory extends ListFactory, TypeAlg<IEval> {
    @Override
    default IEval type(java.lang.String name) {
        return (env, store, given) -> new Type(name);
    }

    @Override
    default IEval typed(IEval exp, IEval type) {
        return exp;
    }
}
