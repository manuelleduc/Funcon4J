package funcons.interpreter.values;

import funcons.algebras.values.FloatAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.INumber;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface FloatFactory extends FloatAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval lit(Double i) {
        return (env, given) -> vf.real(i);
    }

    @Override
    default IEval floatAdd(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.add(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatNegate(IEval x) {
        return (env, given) ->
                ((INumber)x.eval(env, given)).negate().toReal(5);
    }

    @Override
    default IEval floatSubtract(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.subtract(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatMultiply(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.multiply(bVal).toReal(5);
        };
    }

    @Override
    default IEval floatDivide(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.divide(bVal, 5).toReal(5);
        };
    }

    @Override
    default IEval floatModulo(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
        };
    }

    @Override
    default IEval floatPowerOf(IEval a, IEval b) {
        return (env, given) -> {
            INumber aVal = (INumber)a.eval(env, given);
            INumber bVal = (INumber)b.eval(env, given);
            return aVal.toReal(5).pow(bVal.toReal(5), 5);
        };
    }
}
