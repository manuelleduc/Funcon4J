package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;
import funcons.types.Abs;
import funcons.types.Environment;

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
    default IEval compose(IEval f, IEval g) {
        return (env, store, given) -> abs(apply(f, apply(g, given))).eval(env, store, given);
    }

    @Override
    default IEval closure(IEval x, IEval environment) {
        return (env, store, given) -> x.eval((Environment)environment.eval(env, store, given), store, given);
    }

    @Override
    default IEval close(IEval abs) {
        return (env, store, given) -> abs(closure(unAbs(abs), (e, s, g) -> env)).eval(env, store, given);
    }

    @Override
    default IEval bind(IEval id) {
        return (env, store, given) -> abs(bindValue(id, given)).eval(env, store, given);
    }

    default IEval unAbs(IEval abs) {
        @SuppressWarnings("unchecked")
        IEval result = (env, store, given) -> ((Abs<IEval>)abs.eval(env, store, given)).body().eval(env, store, given);
        return result;
    }
}
