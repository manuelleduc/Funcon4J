package funcons.interpreter.values;

import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.INumber;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalIntFactory extends IntAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval lit(Integer i) {
        return (env, forwards, store, given) -> vf.integer(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, forward, store, given) ->
                        ((INumber)a.eval(env, forward, store, given))
                                .add(((INumber)b.eval(env, forward, store, given)));
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, forward, store, given) ->
                ((INumber)x.eval(env, forward, store, given)).negate();
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given))
                        .subtract(((INumber)b.eval(env, forward, store, given)));
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given))
                        .multiply(((INumber)b.eval(env, forward, store, given)));
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, forward, store, given) ->
                ((INumber)a.eval(env, forward, store, given))
                        .divide(((INumber)b.eval(env, forward, store, given)), 0);
    }

    @Override
    default IEval intModulo(IEval a, IEval b) {
        return (env, forward, store, given) -> {
            INumber aNumber = (INumber) a.eval(env, forward, store, given);
            INumber bNumber = (INumber) a.eval(env, forward, store, given);
            return aNumber.subtract(aNumber.divide(bNumber, 0).multiply(bNumber));
        };
    }
}
