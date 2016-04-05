package funcons.interpreter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.sorts.IEval;
import funcons.types.Bool;

public class LogicIfTrueFactory<T> extends EffectFactory implements LogicIfTrueAlg<Bool, T> {

    @Override
    public IEval<Bool> bool(java.lang.Boolean b) {
        return () -> new Bool(b);
    }

    @Override
    public IEval<T> ifTrue(IEval<Bool> e, IEval<T> c1, IEval<T> c2) {
        return () -> (e.eval().boolValue() ? c1 : c2).eval();
    }
}
