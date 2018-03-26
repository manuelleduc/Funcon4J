package funcons.truffle.recursion;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleRecursiveFactory extends
        NullAlg<CLStatementNode>,
        LogicControlAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        MapAlg<CLStatementNode>,
        ListAlg<CLStatementNode>,
        IntAlg<CLStatementNode>,
        RecursiveAlg<CLStatementNode> {

    @Override
    default CLStatementNode freshFwd() {
//        return (env, given) -> new Fwd();
        return null; // TODO
    }

    @Override
    default CLStatementNode freshFwds(CLStatementNode idList) {
//        return (env, given) -> {
//            CLStatementNode envEval = environment();
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
    default CLStatementNode setForwards(CLStatementNode idFwdMap) {
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
    default CLStatementNode reclose(CLStatementNode map, CLStatementNode decl) {
//        return (env, given) -> {
//            IValue m = map.eval(env, given);
//            return accum(scope((e,g) -> m, decl), seq(setForwards((e,g) -> m), environment())).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode recursive(CLStatementNode idList, CLStatementNode decl) {
//        return reclose(freshFwds(idList), decl);
        return null; // TODO
    }

    @Override
    default CLStatementNode recursiveTyped(CLStatementNode idTypeMap, CLStatementNode decl) {
//        return recursive(mapDomain(idTypeMap), decl);
        return null; // TODO
    }

    @Override
    default CLStatementNode followFwd(CLStatementNode fwd) {
//        return (env, given) -> ((Fwd)fwd.eval(env, given)).follow();
        return null; // TODO
    }

    @Override
    default CLStatementNode followIfFwd(CLStatementNode fwd) {
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