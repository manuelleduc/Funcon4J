package funcons.interpreter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;
import funcons.types.Int;

public interface IntCalcFactory extends IntCalcAlg<IEval> {
    @Override
    default IEval lit(java.lang.Integer i) {
        return (Environment env) -> new Int(i);
    }

    @Override
    default IEval bool(java.lang.Boolean b) {
        return (Environment env) -> new Bool(b);
    }

    @Override
    default IEval intAdd(IEval a, IEval b) {
        return (Environment env) -> new Int(((Int)a.eval(env)).intValue() + ((Int)b.eval(env)).intValue());
    }

    @Override
    default IEval intSubtract(IEval a, IEval b) {
        return (Environment env) -> new Int(((Int)a.eval(env)).intValue() - ((Int)b.eval(env)).intValue());
    }

    @Override
    default IEval intMultiply(IEval a, IEval b) {
        return (Environment env) -> new Int(((Int)a.eval(env)).intValue() * ((Int)b.eval(env)).intValue());
    }

    @Override
    default IEval intDivide(IEval a, IEval b) {
        return (Environment env) -> new Int(((Int)a.eval(env)).intValue() / ((Int)b.eval(env)).intValue());
    }
}
