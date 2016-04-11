package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.Int;

public interface IntCalcFactory extends IntCalcAlg<IEval> {
    @Override
    default IEval lit(java.lang.Integer i) {
        return (env, store, given) -> new Int(i);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (env, store, given) -> new Int(((Int)a.eval(env, store, given)).intValue() + ((Int)b.eval(env, store, given)).intValue());
    }

    @Override
    default IEval intNegate(IEval x) {
        return (env, store, given) -> new Int(-((Int)x.eval(env, store, given)).intValue());
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (env, store, given) -> new Int(((Int)a.eval(env, store, given)).intValue() - ((Int)b.eval(env, store, given)).intValue());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (env, store, given) -> new Int(((Int)a.eval(env, store, given)).intValue() * ((Int)b.eval(env, store, given)).intValue());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (env, store, given) -> new Int(((Int)a.eval(env, store, given)).intValue() / ((Int)b.eval(env, store, given)).intValue());
    }
}
