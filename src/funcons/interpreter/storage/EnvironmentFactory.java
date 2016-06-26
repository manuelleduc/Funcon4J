package funcons.interpreter.storage;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IMapWriter;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface EnvironmentFactory extends
        MapAlg<IEval>,
        EnvironmentAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval id(java.lang.String s) {
        return (env, forward, store, given) -> vf.string(s);
    }

    @Override
    default IEval nameId(java.lang.String namespace, java.lang.String id) {
        return (env, forward, store, given) -> vf.tuple(vf.string(namespace), vf.string(id));
    }

    @Override
    default IEval bindValue(IEval id, IEval exp) {
        return (env, forward, store, given) -> {
            IMapWriter mw = vf.mapWriter();
            mw.put((IValue)id.eval(env, forward, store, given), (IValue)exp.eval(env, forward, store, given));
            return mw.done();
        };
    }

    @Override
    default IEval boundValue(IEval id) {
        return (env, forward, store, given) -> env.get((IValue)id.eval(env, forward, store, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, forward, store, given) -> {
            IMap local = (IMap)localBindings.eval(env, forward, store, given);
            return exp.eval(env.join(local), forward, store, given);
        };
    }

    @Override
    default IEval closure(IEval x, IEval environment) {
        return (env, forward, store, given) ->
                x.eval((IMap)environment.eval(env, forward, store, given), forward, store, given);
    }

    @Override
    default IEval environment() {
        return (env, forward, store, given) -> vf.mapWriter().done();
    }

    @Override
    default IEval accum(IEval environment, IEval decl) {
        return (env, forward, store, given) -> {
            IValue currentEnv = (IValue)environment.eval(env, forward, store, given);
            return scope((e,f,s,g) -> currentEnv, mapOver(decl, (e,f,s,g) -> currentEnv)).eval(env, forward, store, given);
        };
    }
}
