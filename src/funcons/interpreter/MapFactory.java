package funcons.interpreter;

import funcons.algebras.MapAlg;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Map;
import funcons.values.Value;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;

public interface MapFactory extends LogicWhileTrueFactory, MapAlg<IEval> {
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
    default IEval mapUpdate(IEval map, IEval key, IEval e) {
        return (env, forward, store, given) -> {
            Map m = (Map)map.eval(env, forward, store, given);
            Value k = key.eval(env, forward, store, given);
            Value v = e.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Map m2 = m.add(k, v);
            return m2;
        };
    }

    @Override
    default IEval mapUnion(IEval map1, IEval map2) {
        return (env, forward, store, given) -> {
            Map m1 = (Map)map1.eval(env, forward, store, given);
            Map m2 = (Map)map2.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m1.extend(m2);
            return m3;
        };
    }

    @Override
    default IEval mapOver(IEval map1, IEval map2) {
        return (env, forward, store, given) -> {
            Map m1 = (Map)map1.eval(env, forward, store, given);
            Map m2 = (Map)map2.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m2.extend(m1);
            return m3;
        };
    }
}
