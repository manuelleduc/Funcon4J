package funcons.interpreter.collections;

import funcons.algebras.collections.MapAlg;
import funcons.carriers.IEval;
import funcons.values.List;
import funcons.values.Map;
import funcons.values.properties.Value;

import java.util.Set;

public interface MapFactory extends MapAlg<IEval> {

    @Override
    default IEval map(IEval key, IEval val) {
        return (env, forward, store, given) -> {
            Value keyVal = key.eval(env, forward, store, given);
            Value valVal = val.eval(env, forward, store, given);
            return new Map<>(keyVal, valVal);
        };
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
    default IEval mapDomain(IEval map) {
        return (env, forward, store, given) -> {
            Map m = (Map)map.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Set<Value> keys = m.keys();
            List l = new List();
            for (Value key : keys) {
                l = l.prepend(key);
            }
            return l;
        };
    }

    @Override
    default IEval mapUnion(IEval map1, IEval map2) {
        return (env, forward, store, given) -> {
            Map m1 = (Map)map1.eval(env, forward, store, given);
            Map m2 = (Map)map2.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m1.join(m2);
            return m3;
        };
    }

    @Override
    default IEval mapOver(IEval map1, IEval map2) {
        return (env, forward, store, given) -> {
            Map m1 = (Map)map1.eval(env, forward, store, given);
            Map m2 = (Map)map2.eval(env, forward, store, given);
            @SuppressWarnings("unchecked")
            Map m3 = m2.join(m1);
            return m3;
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval mapGet(IEval map, IEval key) {
        return (env, forward, store, given) -> {
            Map m = (Map)map.eval(env, forward, store, given);
            return (Value)m.val(key.eval(env, forward, store, given));
        };
    }
}
