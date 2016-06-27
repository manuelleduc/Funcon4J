package funcons.interpreter.storage;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IMapWriter;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface EnvironmentFactory extends
        MapAlg<IEval>,
        EnvironmentAlg<IEval> {

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
            mw.put((IValue)id.eval(env, given), (IValue)exp.eval(env, given));
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
            IValue currentEnv = (IValue)environment.eval(env, given);
            return scope((e,g) -> currentEnv, mapOver(decl, (e,g) -> currentEnv)).eval(env, given);
        };
    }
}
