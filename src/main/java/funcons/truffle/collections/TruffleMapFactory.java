package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.collections.MapAlg;

public interface TruffleMapFactory extends MapAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode map(FNCExecuteNode key, FNCExecuteNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMapWriter mw = vf.mapWriter();
//            mw.put(k, v);
//            return mw.done();
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode mapUpdate(FNCExecuteNode map, FNCExecuteNode key, FNCExecuteNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMap m = (IMap) map.eval(env, given);
//            return m.put(k, v);
//        };
        return new MapMapUpdateNode(map, key, val);
    }

    @Override
    default FNCExecuteNode mapDomain(FNCExecuteNode map) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            IListWriter lw = vf.listWriter();
//            m.forEach(lw::append);
//            return lw.done();
//        };
        return new MapMapDomainNode(map);
    }

    @Override
    default FNCExecuteNode mapUnion(FNCExecuteNode map1, FNCExecuteNode map2) {
        return new MapUnionNode(map1, map2);
    }

    @Override
    default FNCExecuteNode mapOver(FNCExecuteNode map1, FNCExecuteNode map2) {
//        return (env, given) -> {
//            IMap m1 = (IMap) map1.eval(env, given);
//            IMap m2 = (IMap) map2.eval(env, given);
//            return m2.join(m1);
//        };
        return new MapMapOverNode(map1, map2);
    }

    @Override
    default FNCExecuteNode mapGet(FNCExecuteNode map, FNCExecuteNode key) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            return m.get((IValue) key.eval(env, given));
//        };
        return new MapMapGetNode(map, key);
    }

}
