package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.MapAlg;

public interface TruffleMapFactory extends MapAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode map(CLExecuteNode key, CLExecuteNode val) {
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
    default CLExecuteNode mapUpdate(CLExecuteNode map, CLExecuteNode key, CLExecuteNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMap m = (IMap) map.eval(env, given);
//            return m.put(k, v);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode mapDomain(CLExecuteNode map) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            IListWriter lw = vf.listWriter();
//            m.forEach(lw::append);
//            return lw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode mapUnion(CLExecuteNode map1, CLExecuteNode map2) {
        return new MapUnionNode(map1, map2);
    }

    @Override
    default CLExecuteNode mapOver(CLExecuteNode map1, CLExecuteNode map2) {
//        return (env, given) -> {
//            IMap m1 = (IMap) map1.eval(env, given);
//            IMap m2 = (IMap) map2.eval(env, given);
//            return m2.join(m1);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode mapGet(CLExecuteNode map, CLExecuteNode key) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            return m.get((IValue) key.eval(env, given));
//        };
        return null; // TODO
    }

}
