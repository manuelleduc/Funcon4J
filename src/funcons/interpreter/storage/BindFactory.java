package funcons.interpreter.storage;

import funcons.algebras.storage.BindAlg;
import funcons.carriers.IEval;
import funcons.interpreter.values.MapFactory;
import funcons.values.Environment;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;

public interface BindFactory extends MapFactory, BindAlg<IEval> {
    @Override
    default IEval id(java.lang.String s) {
        return (env, forward, store, given) -> new Id(s);
    }

    @Override
    default IEval nameId(java.lang.String namespace, java.lang.String id) {
        return (env, forward, store, given) -> new NameId(namespace, id);
    }

    @Override
    default IEval bindValue(IEval id, IEval exp) {
        return (env, forward, store, given) ->
                new Environment(((Id)id.eval(env, forward, store, given)), exp.eval(env, forward, store, given));
    }

    @Override
    default IEval boundValue(IEval id) {
        return (env, forward, store, given) -> env.val((Id) id.eval(env, forward, store, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, forward, store, given) ->
                exp.eval(env.extend((Environment)localBindings.eval(env, forward, store, given)), forward, store, given);
    }

    @Override
    default IEval given() {
        return (env, forward, store, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, forward, store, given) -> x.eval(env, forward, store, exp.eval(env, forward, store, given));
    }

    @Override
    default IEval environment() {
        return (env, forward, store, given) -> new Environment();
    }

    @Override
    default IEval environment(IEval id, IEval val) {
        return (env, forward, store, given) ->
                new Environment(
                        (Id)id.eval(env, forward, store, given),
                        val.eval(env, forward, store, given)
                );
    }

    @Override
    default IEval accum(IEval environment, IEval decl) {
        return (env, forward, store, given) -> {
            Environment currentEnv = (Environment)environment.eval(env, forward, store, given);
            return scope((e,f,s,g) -> currentEnv, mapOver(decl, (e,f,s,g) -> currentEnv)).eval(env, forward, store, given);
        };
    }
}
