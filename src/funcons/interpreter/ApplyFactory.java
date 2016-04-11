package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;
import funcons.types.Abs;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return (env, store, given) -> new Abs<>(exp);
    }

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return supply(arg, unAbs(abs));
    }

    @Override
    default IEval bind(IEval var) {
        return abs(bindValue(var, given()));
    }

    default IEval unAbs(IEval abs) {
        return (env, store, given) -> ((Abs<IEval>)abs.eval(env, store, given)).body().eval(env, store, given);
    }
}
