package funcons.interpreter.values;

import funcons.algebras.values.FloatAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.INumber;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface FloatFactory extends FloatAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval lit(Double i) {
        return (env, store, given) -> vf.real(i);
    }

    @Override
    default IEval floatAdd(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.add(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatNegate(IEval x) {
        return (env, store, given) ->
                ((INumber)x.eval(env, store, given)).negate().toReal(5);
    }

    @Override
    default IEval floatSubtract(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.subtract(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatMultiply(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.multiply(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatDivide(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.divide(bVal, 5).toReal(5);
        };
    }

    @Override
    default IEval floatModulo(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
        };
    }

    @Override
    default IEval floatPowerOf(IEval a, IEval b) {
        return (env, store, given) -> {
            INumber aVal = (INumber)a.eval(env, store, given);
            INumber bVal = (INumber)b.eval(env, store, given);
            return aVal.toReal(5).pow(bVal.toReal(5), 5);
        };
    }
}
