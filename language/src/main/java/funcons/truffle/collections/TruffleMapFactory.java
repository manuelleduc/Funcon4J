package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleMapFactory extends MapAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST map(FNCBuildAST key, FNCBuildAST val) {
        return new Map(key, val);
    }

    class Map implements FNCBuildAST {

        private final FNCBuildAST key;
        private final FNCBuildAST val;

        public Map(FNCBuildAST fncExpressionNode, FNCBuildAST fncExpressionNode1) {
            this.key = fncExpressionNode;
            this.val = fncExpressionNode1;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage language) throws RunTimeFunconException {
            return new MapMapNode(this.key.buildAST(language), this.val.buildAST(language));
        }
    }

    @Override
    default FNCBuildAST mapUpdate(FNCBuildAST map, FNCBuildAST key, FNCBuildAST val) {
        return new MapUpdate(map, key, val);
    }

    @Override
    default FNCBuildAST mapDomain(FNCBuildAST map) {
        return new MapDomain(map);
    }

    @Override
    default FNCBuildAST mapUnion(FNCBuildAST map1, FNCBuildAST map2) {
        return new MapUnion(map1, map2);
    }

    @Override
    default FNCBuildAST mapOver(FNCBuildAST map1, FNCBuildAST map2) {
        return new MapOver(map1, map2);
    }

    @Override
    default FNCBuildAST mapGet(FNCBuildAST map, FNCBuildAST key) {
        return new MapGet(map, key);

    }

    class MapUpdate implements FNCBuildAST {
        private final FNCBuildAST map;
        private final FNCBuildAST key;
        private final FNCBuildAST val;

        public MapUpdate(FNCBuildAST map, FNCBuildAST key, FNCBuildAST val) {
            this.map = map;
            this.key = key;
            this.val = val;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapUpdateNode((FNCExpressionNode) map, (FNCExpressionNode) key, (FNCExpressionNode) val);
        }
    }

    class MapUnion implements FNCBuildAST {
        private final FNCBuildAST map1;
        private final FNCBuildAST map2;

        public MapUnion(FNCBuildAST map1, FNCBuildAST map2) {
            this.map1 = map1;
            this.map2 = map2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapUnionNode(map1.buildAST(l), map2.buildAST(l));
        }
    }

    class MapOver implements FNCBuildAST {
        private final FNCBuildAST map1;
        private final FNCBuildAST map2;

        public MapOver(FNCBuildAST map1, FNCBuildAST map2) {
            this.map1 = map1;
            this.map2 = map2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapOverNode(map1.buildAST(l), map2.buildAST(l));
        }
    }

    class MapGet implements FNCBuildAST {
        private final FNCBuildAST map;
        private final FNCBuildAST key;

        public MapGet(FNCBuildAST map, FNCBuildAST key) {
            this.map = map;
            this.key = key;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapGetNode((FNCExpressionNode) map.buildAST(l), (FNCExpressionNode) key.buildAST(l));
        }
    }

    class MapDomain implements FNCBuildAST {
        private final FNCBuildAST map;

        public MapDomain(FNCBuildAST map) {
            this.map = map;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new MapMapDomainNode(map.buildAST(l));
        }
    }
}
