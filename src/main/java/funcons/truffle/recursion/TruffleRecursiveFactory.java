package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleRecursiveFactory extends
        NullAlg<CLExecuteNode>,
        LogicControlAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        ListAlg<CLExecuteNode>,
        IntAlg<CLExecuteNode>,
        RecursiveAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode freshFwd() {
//        return (env, given) -> new Fwd();
        return null; // TODO
    }

    @Override
    default CLExecuteNode freshFwds(CLExecuteNode idList) {
//        return (env, given) -> {
//            CLExecuteNode envEval = environment();
//            IValue idListVal = idList.eval(env, given);
//            int length = ((IInteger)listLength((e, g)->idListVal).eval(env, given)).intValue();
//            IValue undefined = undefined().eval(env, given);
//
//            for (int i = 0; i < length; i++) {
//                IValue id = projectList(lit(i), (e,g)->idListVal).eval(env, given);
//                Fwd fwd = (Fwd)freshFwd().eval(env, given);
//                fwd.add(undefined);
//
//                envEval = mapUpdate(envEval, (e,g) -> id, (e,g) -> fwd);
//            }
//
//            return envEval.eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode setForwards(CLExecuteNode idFwdMap) {
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
        return null; // TODO
    }

    @Override
    default CLExecuteNode reclose(CLExecuteNode map, CLExecuteNode decl) {
//        return (env, given) -> {
//            IValue m = map.eval(env, given);
//            return accum(scope((e,g) -> m, decl), seq(setForwards((e,g) -> m), environment())).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode recursive(CLExecuteNode idList, CLExecuteNode decl) {
//        return reclose(freshFwds(idList), decl);
        return null; // TODO
    }

    @Override
    default CLExecuteNode recursiveTyped(CLExecuteNode idTypeMap, CLExecuteNode decl) {
//        return recursive(mapDomain(idTypeMap), decl);
        return null; // TODO
    }

    @Override
    default CLExecuteNode followFwd(CLExecuteNode fwd) {
//        return (env, given) -> ((Fwd)fwd.eval(env, given)).follow();
        return null; // TODO
    }

    @Override
    default CLExecuteNode followIfFwd(CLExecuteNode fwd) {
//        return (env, given) -> {
//            IValue v = fwd.eval(env, given);
//            if (v instanceof Fwd) {
//                return ((Fwd)v).follow();
//            }
//            return v;
//        };
        return null; // TODO
    }
}