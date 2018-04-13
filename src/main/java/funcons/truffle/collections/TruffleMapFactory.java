package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

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
        return new MapMapUpdateNode((FNCExpressionNode) map, (FNCExpressionNode) key, (FNCExpressionNode) val);
    }

    @Override
    default FNCExecuteNode mapDomain(FNCExecuteNode map) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            IListWriter lw = vf.listWriter();
//            m.forEach(lw::append);
//            return lw.done();
//        };
        return new MapMapDomainNode((FNCExpressionNode) map);
    }

    @Override
    default FNCExecuteNode mapUnion(FNCExecuteNode map1, FNCExecuteNode map2) {
        return new MapUnionNode(map1, map2);
    }

    @Override
    default FNCExecuteNode mapOver(FNCExecuteNode map1, FNCExecuteNode map2) {
        return new MapMapOverNode((FNCExpressionNode) map1, (FNCExpressionNode) map2);
    }

    @Override
    default FNCExecuteNode mapGet(FNCExecuteNode map, FNCExecuteNode key) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            return m.get((IValue) key.eval(env, given));
//        };
        return new MapMapGetNode((FNCExpressionNode) map, (FNCExpressionNode) key);
    }

}
