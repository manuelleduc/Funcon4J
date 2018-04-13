package funcons.truffle.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleListFactory extends
        PatternAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        ExceptionAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode projectList(FNCExecuteNode index, FNCExecuteNode list) {
//        return (env, given) -> {
//            IInteger i = (IInteger) index.eval(env, given);
//            IList l = (IList) list.eval(env, given);
//            return l.get(i.intValue());
//        };

        return l -> new ListProjectListNode((FNCExpressionNode) index, (FNCExpressionNode) list);
    }

    @Override
    default FNCExecuteNode list() {
//        return (env, given) -> vf.list();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode list(FNCExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode list(FNCExecuteNode x1, FNCExecuteNode x2) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listPrefix(FNCExecuteNode x, FNCExecuteNode l) {
//        return (env, given) -> {
//            IList list = (IList) l.eval(env, given);
//            return list.insert(x.eval(env, given));
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listPrefixMatch(FNCExecuteNode l, FNCExecuteNode p1, FNCExecuteNode p2) {
//        return (env, given) -> {
//            IList list = (IList) l.eval(env, given);
//            if (list.length() == 0) {
//                return fail().eval(env, given);
//            }
//            IValue head = list.get(0);
//            IList tail = list.delete(0);
//            return mapOver(match((e, g) -> head, p1), match((e, g) -> tail, p2)).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listPrefixPatt(FNCExecuteNode p1, FNCExecuteNode p2) {
//        return abs(listPrefixMatch(given(), p1, p2));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode intClosedInterval(FNCExecuteNode m, FNCExecuteNode n) {
//        return (env, given) -> {
//            int start = ((IInteger) m.eval(env, given)).intValue();
//            int finish = ((IInteger) n.eval(env, given)).intValue();
//            IListWriter lw = vf.listWriter();
//            for (int i = start; i <= finish; i++) {
//                lw.append(vf.integer(i));
//            }
//            return lw.done();
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listReverse(FNCExecuteNode l) {
//        return (env, given) -> ((IList) l.eval(env, given)).reverse();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listAppend(FNCExecuteNode list1, FNCExecuteNode list2) {
//        return (env, given) -> {
//            IList l1 = (IList) list1.eval(env, given);
//            IList l2 = (IList) list2.eval(env, given);
//            return l1.concat(l2);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listHead(FNCExecuteNode list) {
//        return (env, given) -> ((IList) list.eval(env, given)).get(0);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listTail(FNCExecuteNode list) {
//        return (env, given) -> {
//            IList listVal = ((IList) list.eval(env, given));
//            if (listVal.length() <= 1) {
//                return vf.list();
//            }
//            return listVal.sublist(1, listVal.length() - 1);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode listLength(FNCExecuteNode list) {
//        return (env, given) ->
//                vf.integer(((IList) list.eval(env, given)).length());
        return l-> new ListListLengthNode((FNCExpressionNode) list);
    }


}