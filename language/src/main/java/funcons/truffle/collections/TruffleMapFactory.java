package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.MapAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;

public interface TruffleMapFactory extends MapAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode map(FNCExecuteNode key, FNCExecuteNode val) {
        return new Map(key, val);
    }

    class Map implements FNCExecuteNode {

        private final FNCExecuteNode key;
        private final FNCExecuteNode val;

        public Map(FNCExecuteNode fncExpressionNode, FNCExecuteNode fncExpressionNode1) {
            this.key = fncExpressionNode;
            this.val = fncExpressionNode1;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage language) throws RunTimeFunconException {
            return new MapMapNode((FNCExpressionNode) this.key.buildAST(language), (FNCExpressionNode) this.val.buildAST(language));
        }
    }

    @Override
    default FNCExecuteNode mapUpdate(FNCExecuteNode map, FNCExecuteNode key, FNCExecuteNode val) {
//        return (env, given) -> {
//            IValue k = (IValue) key.eval(env, given);
//            IValue v = (IValue) val.eval(env, given);
//            IMap m = (IMap) map.eval(env, given);
//            return m.put(k, v);
//        };
        return new MapUpdate(map, key, val);
    }

    @Override
    default FNCExecuteNode mapDomain(FNCExecuteNode map) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            IListWriter lw = vf.listWriter();
//            m.forEach(lw::append);
//            return lw.done();
//        };
        return new MapDomain(map);
    }

    @Override
    default FNCExecuteNode mapUnion(FNCExecuteNode map1, FNCExecuteNode map2) {
        return new MapUnion(map1, map2);
    }

    @Override
    default FNCExecuteNode mapOver(FNCExecuteNode map1, FNCExecuteNode map2) {
        return new MapOver(map1, map2);
    }

    @Override
    default FNCExecuteNode mapGet(FNCExecuteNode map, FNCExecuteNode key) {
//        return (env, given) -> {
//            IMap m = (IMap) map.eval(env, given);
//            return m.get((IValue) key.eval(env, given));
//        };
        return new MapGet(map, key);

    }

    class MapUpdate implements FNCExecuteNode {
        private final FNCExecuteNode map;
        private final FNCExecuteNode key;
        private final FNCExecuteNode val;

        public MapUpdate(FNCExecuteNode map, FNCExecuteNode key, FNCExecuteNode val) {
            this.map = map;
            this.key = key;
            this.val = val;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapUpdateNode((FNCExpressionNode) map, (FNCExpressionNode) key, (FNCExpressionNode) val);
        }
    }

    class MapUnion implements FNCExecuteNode {
        private final FNCExecuteNode map1;
        private final FNCExecuteNode map2;

        public MapUnion(FNCExecuteNode map1, FNCExecuteNode map2) {
            this.map1 = map1;
            this.map2 = map2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapUnionNode((FNCExpressionNode) map1.buildAST(l), (FNCExpressionNode) map2.buildAST(l));
        }
    }

    class MapOver implements FNCExecuteNode {
        private final FNCExecuteNode map1;
        private final FNCExecuteNode map2;

        public MapOver(FNCExecuteNode map1, FNCExecuteNode map2) {
            this.map1 = map1;
            this.map2 = map2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapOverNode((FNCExpressionNode) map1.buildAST(l), (FNCExpressionNode) map2.buildAST(l));
        }
    }

    class MapGet implements FNCExecuteNode {
        private final FNCExecuteNode map;
        private final FNCExecuteNode key;

        public MapGet(FNCExecuteNode map, FNCExecuteNode key) {
            this.map = map;
            this.key = key;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapGetNode((FNCExpressionNode) map, (FNCExpressionNode) key);
        }
    }

    class MapDomain implements FNCExecuteNode {
        private final FNCExecuteNode map;

        public MapDomain(FNCExecuteNode map) {
            this.map = map;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapDomainNode((FNCExpressionNode) map.buildAST(l));
        }
    }
}
