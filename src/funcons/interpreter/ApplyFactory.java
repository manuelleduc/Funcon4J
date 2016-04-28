package funcons.interpreter;

import funcons.Store;
import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;
import funcons.values.*;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return (env, store, given) -> new Abs<>(exp);
    }

    @Override
    default IEval abs(IEval patt, IEval exp) { // TODO Hacky, what is depends(X,Y)?
        return (env, store, given) -> new Abs<IEval>((e, s, g) -> {
            @SuppressWarnings("unchecked")
            Environment environment = (Environment)((Abs<IEval>)patt.eval(e,s,g)).body().eval(e,s,g);
            return exp.eval(e.extend(environment), s, g);
        });
    }

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return (env, store, given) -> supply(arg, unAbs(abs, env, store, given)).eval(env, store, given);
    }

    @Override
    default IEval scopeInner(IEval patt, IEval f) {
        return (env, store, given) -> new Abs<IEval>((e, s, g) -> {
            @SuppressWarnings("unchecked")
            Environment environment = (Environment)((Abs<IEval>)patt.eval(e,s,g)).body().eval(e,s,g);
            return unAbs(f, e, s, g).eval(e.extend(environment), s, g);
        });
    }

    @Override
    default IEval compose(IEval f, IEval g) {
        return abs(apply(f, apply(g, given())));
    }

    @Override
    default IEval closure(IEval x, IEval environment) {
        return (env, store, given) -> x.eval((Environment)environment.eval(env, store, given), store, given);
    }

    @Override
    default IEval close(IEval abs) {
        return (env, store, given) -> abs(closure(unAbs(abs, env, store, given), (e, s, g) -> env)).eval(env, store, given);
    }

    @Override
    default IEval bind(IEval id) {
        return abs(bindValue(id, given()));
    }

    default IEval unAbs(IEval abs, Environment e, Store s, Value g) {
        return (env, store, given) -> {
            @SuppressWarnings("unchecked")
            IEval result = ((Abs<IEval>)abs.eval(e, s, g)).body();
            return result.eval(env, store, given);
        };
    }
}
