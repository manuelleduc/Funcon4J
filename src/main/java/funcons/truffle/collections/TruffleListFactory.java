package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;

public interface TruffleListFactory extends
        PatternAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        ListAlg<CLExecuteNode>,
        ExceptionAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode projectList(CLExecuteNode index, CLExecuteNode list) {
//        return (env, given) -> {
//            IInteger i = (IInteger) index.eval(env, given);
//            IList l = (IList) list.eval(env, given);
//            return l.get(i.intValue());
//        };

        return null; // TODO
    }

    @Override
    default CLExecuteNode list() {
//        return (env, given) -> vf.list();
        return null; // TODO
    }

    @Override
    default CLExecuteNode list(CLExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode list(CLExecuteNode x1, CLExecuteNode x2) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode listPrefix(CLExecuteNode x, CLExecuteNode l) {
//        return (env, given) -> {
//            IList list = (IList) l.eval(env, given);
//            return list.insert(x.eval(env, given));
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode listPrefixMatch(CLExecuteNode l, CLExecuteNode p1, CLExecuteNode p2) {
//        return (env, given) -> {
//            IList list = (IList) l.eval(env, given);
//            if (list.length() == 0) {
//                return fail().eval(env, given);
//            }
//            IValue head = list.get(0);
//            IList tail = list.delete(0);
//            return mapOver(match((e, g) -> head, p1), match((e, g) -> tail, p2)).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode listPrefixPatt(CLExecuteNode p1, CLExecuteNode p2) {
//        return abs(listPrefixMatch(given(), p1, p2));
        return null; // TODO
    }

    @Override
    default CLExecuteNode intClosedInterval(CLExecuteNode m, CLExecuteNode n) {
//        return (env, given) -> {
//            int start = ((IInteger) m.eval(env, given)).intValue();
//            int finish = ((IInteger) n.eval(env, given)).intValue();
//            IListWriter lw = vf.listWriter();
//            for (int i = start; i <= finish; i++) {
//                lw.append(vf.integer(i));
//            }
//            return lw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode listReverse(CLExecuteNode l) {
//        return (env, given) -> ((IList) l.eval(env, given)).reverse();
        return null; // TODO
    }

    @Override
    default CLExecuteNode listAppend(CLExecuteNode list1, CLExecuteNode list2) {
//        return (env, given) -> {
//            IList l1 = (IList) list1.eval(env, given);
//            IList l2 = (IList) list2.eval(env, given);
//            return l1.concat(l2);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode listHead(CLExecuteNode list) {
//        return (env, given) -> ((IList) list.eval(env, given)).get(0);
        return null; // TODO
    }

    @Override
    default CLExecuteNode listTail(CLExecuteNode list) {
//        return (env, given) -> {
//            IList listVal = ((IList) list.eval(env, given));
//            if (listVal.length() <= 1) {
//                return vf.list();
//            }
//            return listVal.sublist(1, listVal.length() - 1);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode listLength(CLExecuteNode list) {
//        return (env, given) ->
//                vf.integer(((IList) list.eval(env, given)).length());
        return null; // TODO
    }


}