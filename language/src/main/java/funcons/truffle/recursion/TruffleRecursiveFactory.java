package funcons.truffle.recursion;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;

public interface TruffleRecursiveFactory extends
        NullAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        IntAlg<FNCExecuteNode>,
        RecursiveAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode freshFwd() {
//        return (env, given) -> new Fwd();
        return new FreshFwd();
    }

    @Override
    default FNCExecuteNode freshFwds(FNCExecuteNode idList) {
        return new FreshFwds(idList);
    }

    @Override
    default FNCExecuteNode setForwards(FNCExecuteNode idFwdMap) {
        return new SetForwards(idFwdMap);
    }

    @Override
    default FNCExecuteNode reclose(FNCExecuteNode map, FNCExecuteNode decl) {
        return new Reclose(map, decl, this);
    }

    @Override
    default FNCExecuteNode recursive(FNCExecuteNode idList, FNCExecuteNode decl) {
        return reclose(freshFwds(idList), decl);
    }

    @Override
    default FNCExecuteNode recursiveTyped(FNCExecuteNode idTypeMap, FNCExecuteNode decl) {
        return recursive(mapDomain(idTypeMap), decl);
    }

    @Override
    default FNCExecuteNode followFwd(FNCExecuteNode fwd) {
//        return (env, given) -> ((Fwd)fwd.eval(env, given)).follow();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode followIfFwd(FNCExecuteNode fwd) {
//        return (env, given) -> {
//            IValue v = fwd.eval(env, given);
//            if (v instanceof Fwd) {
//                return ((Fwd)v).follow();
//            }
//            return v;
//        };
        return new FollowIfFwd(fwd);
    }

    class FreshFwd implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFwdNode();
        }
    }

    class FreshFwds implements FNCExecuteNode {
        private final FNCExecuteNode idList;

        public FreshFwds(FNCExecuteNode idList) {
            this.idList = idList;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFreshFwdsNode((FNCExpressionNode) idList.buildAST(l));
        }
    }

    class SetForwards implements FNCExecuteNode {
        private final FNCExecuteNode idFwdMap;

        public SetForwards(FNCExecuteNode idFwdMap) {
            this.idFwdMap = idFwdMap;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveSetForwardsNode((FNCExpressionNode) idFwdMap.buildAST(l));
        }
    }

    class Reclose implements FNCExecuteNode {
        private final FNCExecuteNode map;
        private final FNCExecuteNode decl;
        private final TruffleRecursiveFactory alg;


        public Reclose(FNCExecuteNode map, FNCExecuteNode decl, TruffleRecursiveFactory alg) {
            this.map = map;
            this.decl = decl;
            this.alg = alg;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return alg.accum(alg.scope(map, decl), alg.seq(alg.setForwards(map), alg.environment())).buildAST(l);
        }
    }

    class FollowIfFwd implements FNCExecuteNode {
        private final FNCExecuteNode fwd;

        public FollowIfFwd(FNCExecuteNode fwd) {
            this.fwd = fwd;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return RecursiveFollowIfFwdNodeGen.create((FNCExpressionNode) fwd.buildAST(l));
        }
    }
}