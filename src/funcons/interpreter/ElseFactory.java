package funcons.interpreter;

import funcons.algebras.ElseAlg;
import funcons.signals.FailureTrueSignal;
import funcons.signals.Signal;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;

public interface ElseFactory extends ApplyFactory, ElseAlg<IEval> {

    @Override
    default IEval equal(IEval x1, IEval x2) { // TODO hacky?
        return (Environment env) -> new Bool(x1.eval(env).equals(x2.eval(env)));
    }

    @Override
    default IEval only(IEval v) {
        return ifTrue(equal(given(), v), (Environment env) -> new Environment(), fail());
        //return abs(ifTrue(equal(given(), v), (Environment env) -> new Environment(), fail()));
    }

    @Override
    default IEval any() {
        return (Environment env) -> new Environment();
        //return abs((Environment env) -> new Environment());
    }

    @Override
    default IEval fail() {
        return (Environment env) -> {
            throw new FailureTrueSignal();
        };
    }

    @Override
    default IEval throw_(Signal s) {
        return (Environment env) -> {
            throw s;
        };
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (Environment env) -> {
            try {
                return x1.eval(env);
            } catch(FailureTrueSignal f) {
                return x2.eval(env);
            }
        };
    }

    @Override
    default IEval preferOver(IEval a1, IEval a2) {
        return abs(else_(unAbs(a1), unAbs(a2)));
    }
}
