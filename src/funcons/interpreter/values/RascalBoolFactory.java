package funcons.interpreter.values;

import funcons.algebras.values.BoolAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IBool;
import org.rascalmpl.value.INumber;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalBoolFactory extends BoolAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval bool(Boolean b) {
        return (env, forwards, store, given) -> vf.bool(b);
    }

    @Override
    default IEval not(IEval b) {
        return (env, forwards, store, given) -> ((IBool)b.eval(env, forwards, store, given)).not();
    }

    @Override
    default IEval greater(IEval a, IEval b) {
        return (env, forwards, store, given) -> {
            IValue aVal = (IValue)a.eval(env, forwards, store, given);
            IValue bVal = (IValue)b.eval(env, forwards, store, given);
            return ((INumber)aVal).greater((INumber)bVal);
        };
    }

    @Override
    default IEval smaller(IEval a, IEval b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default IEval greaterEqual(IEval a, IEval b) {
        return (env, forwards, store, given) -> {
            if (((IBool)greater(a,b).eval(env, forwards, store, given)).getValue()) {
                return bool(true).eval(env, forwards, store, given);
            }
            return equal(a, b).eval(env, forwards, store, given);
        };
    }

    @Override
    default IEval smallerEqual(IEval a, IEval b) {
        return not(greater(a, b));
    }

    @Override
    default IEval equal(IEval e1, IEval e2) {
        return (env, forwards, store, given) ->
                vf.bool(e1.eval(env, forwards, store, given).equals(e2.eval(env, forwards, store, given)));
    }

    @Override
    default IEval physicalEqual(IEval e1, IEval e2) {
        return (env, forwards, store, given) ->
            vf.bool(e1.eval(env, forwards, store, given) == e2.eval(env, forwards, store, given));
        }
}
