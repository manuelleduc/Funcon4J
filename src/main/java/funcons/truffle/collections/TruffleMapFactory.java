package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.truffle.nodes.CLStatementNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleMapFactory extends MapAlg<CLStatementNode> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default CLStatementNode map(CLStatementNode key, CLStatementNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMapWriter mw = vf.mapWriter();
//            mw.put(k, v);
//            return mw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode mapUpdate(CLStatementNode map, CLStatementNode key, CLStatementNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMap m = (IMap) map.eval(env, given);
//            return m.put(k, v);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode mapDomain(CLStatementNode map) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            IListWriter lw = vf.listWriter();
//            m.forEach(lw::append);
//            return lw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode mapUnion(CLStatementNode map1, CLStatementNode map2) {
//        return (env, given) -> {
//            IMap m1 = (IMap) map1.eval(env, given);
//            IMap m2 = (IMap) map2.eval(env, given);
//            return m1.join(m2);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode mapOver(CLStatementNode map1, CLStatementNode map2) {
//        return (env, given) -> {
//            IMap m1 = (IMap) map1.eval(env, given);
//            IMap m2 = (IMap) map2.eval(env, given);
//            return m2.join(m1);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode mapGet(CLStatementNode map, CLStatementNode key) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            return m.get((IValue) key.eval(env, given));
//        };
        return null; // TODO
    }
}
