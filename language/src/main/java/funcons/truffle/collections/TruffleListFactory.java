package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.impl.persistent.ValueFactory;

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

        return new ProjectList(index, list);
    }

    @Override
    default FNCExecuteNode list() {
        return new List();
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

        return new ListPrefix(x, l);
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


        return m -> {
            final FNCExpressionNode l1 = l.buildAST(m);
            final ListListPrefixMatchNode listListPrefixMatchNode = new ListListPrefixMatchNode(l1, fail().buildAST(m));
            final FNCExpressionNode g = mapOver(match((z) -> listListPrefixMatchNode.buildE1(), p1), match((z) -> listListPrefixMatchNode.buildE2(), p2)).buildAST(m);
            listListPrefixMatchNode.setG(g);
            return listListPrefixMatchNode;
        };
    }

    @Override
    default FNCExecuteNode listPrefixPatt(FNCExecuteNode p1, FNCExecuteNode p2) {
        return abs(listPrefixMatch(given(), p1, p2));
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
        return l -> new ListIntCloseIntervalNode(m.buildAST(l), n.buildAST(l));
    }

    @Override
    default FNCExecuteNode listReverse(FNCExecuteNode l) {
//        return (env, given) -> ((IList) l.eval(env, given)).reverse();
        return m -> new ListListReverseNode(l.buildAST(m));
    }

    @Override
    default FNCExecuteNode listAppend(FNCExecuteNode list1, FNCExecuteNode list2) {
//        return (env, given) -> {
//            IList l1 = (IList) list1.eval(env, given);
//            IList l2 = (IList) list2.eval(env, given);
//            return l1.concat(l2);
//        };
        return new ListAppend(list1, list2);
    }

    @Override
    default FNCExecuteNode listHead(FNCExecuteNode list) {
//        return (env, given) -> ;
        return l -> {
            FNCExpressionNode list2 = list.buildAST(l);

            // TODO: extract to its own class
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return ((IList) list2.executeGeneric(frame)).get(0);
                }
            };
        };
    }

    @Override
    default FNCExecuteNode listTail(FNCExecuteNode list) {
        return l -> {
            FNCExpressionNode list2 = list.buildAST(l);

            // TODO: extract to its own class
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    IList listVal = ((IList) list2.executeGeneric(frame));
                    if (listVal.length() <= 1) {
                        return ValueFactory.getInstance().list();
                    }
                    return listVal.sublist(1, listVal.length() - 1);
                }
            };
        };
    }

    @Override
    default FNCExecuteNode listLength(FNCExecuteNode list) {
//        return (env, given) ->
//                vf.integer(((IList) list.eval(env, given)).length());
        return new ListLength(list);
    }


    class ProjectList implements FNCExecuteNode {
        private final FNCExecuteNode index;
        private final FNCExecuteNode list;

        public ProjectList(FNCExecuteNode index, FNCExecuteNode list) {
            this.index = index;
            this.list = list;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListProjectListNode((FNCExpressionNode) index, (FNCExpressionNode) list);
        }
    }

    class ListLength implements FNCExecuteNode {
        private final FNCExecuteNode list;

        public ListLength(FNCExecuteNode list) {
            this.list = list;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListListLengthNode(list.buildAST(l));
        }
    }

    class List implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListListNode();
        }
    }

    class ListPrefix implements FNCExecuteNode {
        private final FNCExecuteNode x;
        private final FNCExecuteNode l;

        public ListPrefix(FNCExecuteNode x, FNCExecuteNode l) {
            this.x = x;
            this.l = l;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage m) throws RunTimeFunconException {
            return new ListListPrefixNode(x.buildAST(m), l.buildAST(m));
        }
    }

    class ListAppend implements FNCExecuteNode {
        private final FNCExecuteNode list1;
        private final FNCExecuteNode list2;

        public ListAppend(FNCExecuteNode list1, FNCExecuteNode list2) {
            this.list1 = list1;
            this.list2 = list2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new ListListAppendNode(list1.buildAST(l), list2.buildAST(l));
        }
    }
}