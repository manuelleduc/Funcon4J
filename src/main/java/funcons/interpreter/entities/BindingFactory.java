package funcons.interpreter.entities;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface BindingFactory extends
        MapAlg<IEval>,
        BindingAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval id(java.lang.String s) {
        return (env, given) -> vf.string(s);
    }

    @Override
    default IEval nameId(java.lang.String namespace, java.lang.String id) {
        return (env, given) -> vf.tuple(vf.string(namespace), vf.string(id));
    }

    @Override
    default IEval bindValue(IEval id, IEval exp) {
        return (env, given) -> {
            IMapWriter mw = vf.mapWriter();

            IValue eval = id.eval(env, given);
            IValue eval1 = exp.eval(env, given);
            mw.put(eval, eval1);
            return mw.done();
        };
    }

    @Override
    default IEval boundValue(IEval id) {
        return (env, given) -> env.get((IValue)id.eval(env, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, given) -> {
            IMap local = (IMap)localBindings.eval(env, given);
            return exp.eval(env.join(local), given);
        };
    }

    @Override
    default IEval closure(IEval x, IEval environment) {
        return (env, given) ->
                x.eval((IMap)environment.eval(env, given), given);
    }

    @Override
    default IEval environment() {
        return (env, given) -> vf.mapWriter().done();
    }

    @Override
    default IEval accum(IEval environment, IEval decl) {
        return (env, given) -> {
            IValue currentEnv = environment.eval(env, given);
            IEval scope = scope((e, g) -> currentEnv, mapOver(decl, (e, g) -> currentEnv));
            return scope.eval(env, given);
        };
    }
}
