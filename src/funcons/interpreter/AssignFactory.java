package funcons.interpreter;

import funcons.algebras.AssignAlg;
import funcons.sorts.IEval;
import funcons.values.*;

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
    default IEval assignedValueIfVar(IEval v) {
        return (env, store, given) -> {
            Value val = v.eval(env, store, given);
            try {
                return store.val((Variable)val);
            } catch (java.lang.ClassCastException e) {
                return val;
            }
        };
    }

    @Override
    default IEval alloc(IEval x) {
        return (env, store, given) -> store.alloc(x.eval(env, store, given));
    }

}
