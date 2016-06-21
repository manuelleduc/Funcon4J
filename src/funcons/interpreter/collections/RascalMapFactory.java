package funcons.interpreter.collections;

import funcons.algebras.collections.MapAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IListWriter;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IMapWriter;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalMapFactory extends MapAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval map(IEval key, IEval val) {
        return (env, forwards, store, given) -> {
            IValue k = (IValue)key.eval(env, forwards, store, given);
            IValue v = (IValue)val.eval(env, forwards, store, given);
            IMapWriter mw = vf.mapWriter();
            mw.put(k, v);
            return mw.done();
        };
    }

    @Override
    default IEval mapUpdate(IEval map, IEval key, IEval val) {
        return (env, forwards, store, given) -> {
            IValue k = (IValue)key.eval(env, forwards, store, given);
            IValue v = (IValue)val.eval(env, forwards, store, given);
            IMap m = (IMap)map.eval(env, forwards, store, given);
            return m.put(k, v);
        };
    }

    @Override
    default IEval mapDomain(IEval map) {
        return (env, forwards, store, given) -> {
            IMap m = (IMap)map.eval(env, forwards, store, given);
            IListWriter lw = vf.listWriter();
            m.forEach(lw::append);
            return lw.done();
        };
    }

    @Override
    default IEval mapUnion(IEval map1, IEval map2) {
        return (env, forwards, store, given) -> {
            IMap m1 = (IMap)map1.eval(env, forwards, store, given);
            IMap m2 = (IMap)map2.eval(env, forwards, store, given);
            return m1.join(m2);
        };
    }

    @Override
    default IEval mapOver(IEval map1, IEval map2) {
        return (env, forwards, store, given) -> {
            IMap m1 = (IMap)map1.eval(env, forwards, store, given);
            IMap m2 = (IMap)map2.eval(env, forwards, store, given);
            return m2.join(m1);
        };
    }

    @Override
    default IEval mapGet(IEval map, IEval key) {
        return (env, forwards, store, given) -> {
            IMap m = (IMap)map.eval(env, forwards, store, given);
            return m.get((IValue)key.eval(env, forwards, store, given));
        };
    }
}
