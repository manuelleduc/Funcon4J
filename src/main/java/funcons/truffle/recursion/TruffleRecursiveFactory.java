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
        return l -> new RecursiveFwdNode();
    }

    @Override
    default FNCExecuteNode freshFwds(FNCExecuteNode idList) {
        return language -> new RecursiveFreshFwdsNode((FNCExpressionNode) idList);
    }

    @Override
    default FNCExecuteNode setForwards(FNCExecuteNode idFwdMap) {
        return l -> new RecursiveSetForwardsNode((FNCExpressionNode) idFwdMap);
    }

    @Override
    default FNCExecuteNode reclose(FNCExecuteNode map, FNCExecuteNode decl) {
        return language -> accum(scope(map, decl), seq(setForwards(map), environment())).buildAST(language);
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
        return l -> new RecursiveFollowIfFwdNode((FNCExpressionNode) fwd.buildAST(l));
    }
}