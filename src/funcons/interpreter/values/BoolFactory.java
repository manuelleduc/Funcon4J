package funcons.interpreter.values;

import funcons.algebras.values.BoolAlg;
import funcons.carriers.IEval;
import funcons.helper.RascalValueComperator;
import org.rascalmpl.value.IBool;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface BoolFactory extends BoolAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval bool(Boolean b) {
        return (env, given) -> vf.bool(b);
    }

    @Override
    default IEval not(IEval b) {
        return (env, given) -> ((IBool)b.eval(env, given)).not();
    }

    @Override
    default IEval greater(IEval a, IEval b) {
        return (env, given) -> {
            IValue aVal = (IValue)a.eval(env, given);
            IValue bVal = (IValue)b.eval(env, given);
            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
        };
    }

    @Override
    default IEval smaller(IEval a, IEval b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default IEval greaterEqual(IEval a, IEval b) {
        return (env, given) -> {
            if (((IBool)greater(a,b).eval(env, given)).getValue()) {
                return bool(true).eval(env, given);
            }
            return equal(a, b).eval(env, given);
        };
    }

    @Override
    default IEval smallerEqual(IEval a, IEval b) {
        return not(greater(a, b));
    }

    @Override
    default IEval equal(IEval e1, IEval e2) {
        return (env, given) ->
                vf.bool(((IValue)e1.eval(env, given)).isEqual((IValue)e2.eval(env, given)));
    }

    @Override
    default IEval physicalEqual(IEval e1, IEval e2) {
        return (env, given) ->
            vf.bool(e1.eval(env, given) == e2.eval(env, given));
        }
}
