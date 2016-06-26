package funcons.interpreter.storage;

import funcons.algebras.storage.StoreAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Variable;
import funcons.values.properties.Value;

public interface StoreFactory extends NullAlg<IEval>, StoreAlg<IEval> {

    @Override
    default IEval assign(IEval var, IEval x) {
        return (env, given) -> {
            ((Variable)var.eval(env, given)).store(x.eval(env, given));
            return null_().eval(env, given);
        };
    }

    @Override
    default IEval assignedValue(IEval var) {
        return (env, given) -> ((Variable)var.eval(env, given)).value();
    }

    @Override
    default IEval assignedValueIfVar(IEval v) {
        return (env, given) -> {
            Value val = v.eval(env, given);
            if (val instanceof Variable) {
                return ((Variable)val).value();
            }
            return val;
        };
    }

    @Override
    default IEval alloc(IEval x) {
        return (env, given) -> new Variable(x.eval(env, given));
    }
}
