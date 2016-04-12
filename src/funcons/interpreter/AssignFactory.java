package funcons.interpreter;

import funcons.algebras.AssignAlg;
import funcons.sorts.IEval;
import funcons.types.Null;
import funcons.types.Id;
import funcons.types.Variable;

public interface AssignFactory extends ElseFactory, AssignAlg<IEval> {

    @Override
    default IEval assign(IEval var, IEval x) {
        return (env, store, given) -> {
            store.store((Variable) var.eval(env, store, given), x.eval(env, store, given));
            return new Null();
        };
    }

    @Override
    default IEval assignedValue(IEval var) {
        return (env, store, given) -> store.val((Variable)var.eval(env, store, given));
    }

    @Override
    default IEval alloc(IEval x) {
        return (env, store, given) -> store.alloc(x.eval(env, store, given));
    }
}
