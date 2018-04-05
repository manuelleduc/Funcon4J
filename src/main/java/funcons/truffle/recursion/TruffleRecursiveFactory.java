package funcons.truffle.recursion;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;

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
        return new RecursiveFwdNode();
    }

    @Override
    default FNCExecuteNode freshFwds(FNCExecuteNode idList) {
        return new RecursiveFreshFwdsNode(idList, this, this, this, this, this, this);
    }

    @Override
    default FNCExecuteNode setForwards(FNCExecuteNode idFwdMap) {
//        return (env, given) -> {
//            IValue mapVal = idFwdMap.eval(env, given);
//            IValue mapKeys = mapDomain((e,g)->mapVal).eval(env, given);
//            int length = ((IInteger)listLength((e,g)->mapKeys).eval(env, given)).intValue();
//
//            for (int i = 0; i < length; i++) {
//                IValue id = projectList(lit(i), (e,g)->mapKeys).eval(env, given);
//                IValue v = boundValue((e,g)->id).eval(env, given);
//                if (v == null) {
//                    v = undefined().eval(env, given);
//                }
//                Fwd fwd = (Fwd)mapGet((e,g)->mapVal, (e,g)->id).eval(env, given);
//                fwd.add(v);
//            }
//
//            return null_().eval(env, given);
//        };
        return new RecursiveSetForwardsNode(idFwdMap, this, this, this, this, this);
    }

    @Override
    default FNCExecuteNode reclose(FNCExecuteNode map, FNCExecuteNode decl) {
        return new RecursiveRecloseNode(map, decl, this, this, this);
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
        return new RecursiveFollowIfFwdNode(fwd);
    }
}