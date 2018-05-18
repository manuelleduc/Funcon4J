package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleListFactory extends
        PatternAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        ListAlg<FNCBuildAST>,
        ExceptionAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST projectList(FNCBuildAST index, FNCBuildAST list) {
//        return (env, given) -> {
//            IInteger i = (IInteger) index.eval(env, given);
//            IList l = (IList) list.eval(env, given);
//            return l.get(i.intValue());
//        };

        return new ProjectList(index, list);
    }

    @Override
    default FNCBuildAST list() {
        return new List();
    }

    @Override
    default FNCBuildAST list(FNCBuildAST x) {
        return l -> {
            return new ListList2Node(x.buildAST(l));
        };
    }

    @Override
    default FNCBuildAST list(FNCBuildAST x1, FNCBuildAST x2) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given));
        return l -> {
            final FNCExpressionNode xe1 = x1.buildAST(l);
            final FNCExpressionNode xe2 = x2.buildAST(l);
            return new ListList3Node(xe1, xe2);
        };
    }

    @Override
    default FNCBuildAST listPrefix(FNCBuildAST x, FNCBuildAST l) {

        return new ListPrefix(x, l);
    }

    @Override
    default FNCBuildAST listPrefixMatch(FNCBuildAST l, FNCBuildAST p1, FNCBuildAST p2) {
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
    default FNCBuildAST listPrefixPatt(FNCBuildAST p1, FNCBuildAST p2) {
        return abs(listPrefixMatch(given(), p1, p2));
    }

    @Override
    default FNCBuildAST intClosedInterval(FNCBuildAST m, FNCBuildAST n) {
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
    default FNCBuildAST listReverse(FNCBuildAST l) {
//        return (env, given) -> ((IList) l.eval(env, given)).reverse();
        return m -> new ListListReverseNode(l.buildAST(m));
    }

    @Override
    default FNCBuildAST listAppend(FNCBuildAST list1, FNCBuildAST list2) {
//        return (env, given) -> {
//            IList l1 = (IList) list1.eval(env, given);
//            IList l2 = (IList) list2.eval(env, given);
//            return l1.concat(l2);
//        };
        return new ListAppend(list1, list2);
    }

    @Override
    default FNCBuildAST listHead(FNCBuildAST list) {
        return l -> {
            return new ListListHeadNode(list.buildAST(l));
        };
    }

    @Override
    default FNCBuildAST listTail(FNCBuildAST list) {
        return l -> {
            return new ListListTailNode(list.buildAST(l));
        };
    }

    @Override
    default FNCBuildAST listLength(FNCBuildAST list) {
//        return (env, given) ->
//                vf.integer(((IList) list.eval(env, given)).length());
        return new ListLength(list);
    }


    class ProjectList implements FNCBuildAST {
        private final FNCBuildAST index;
        private final FNCBuildAST list;

        public ProjectList(FNCBuildAST index, FNCBuildAST list) {
            this.index = index;
            this.list = list;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListProjectListNode((FNCExpressionNode) index, (FNCExpressionNode) list);
        }
    }

    class ListLength implements FNCBuildAST {
        private final FNCBuildAST list;

        public ListLength(FNCBuildAST list) {
            this.list = list;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListListLengthNode(list.buildAST(l));
        }
    }

    class List implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListListNode();
        }
    }

    class ListPrefix implements FNCBuildAST {
        private final FNCBuildAST x;
        private final FNCBuildAST l;

        public ListPrefix(FNCBuildAST x, FNCBuildAST l) {
            this.x = x;
            this.l = l;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage m) throws RunTimeFunconException {
            return new ListListPrefixNode(x.buildAST(m), l.buildAST(m));
        }
    }

    class ListAppend implements FNCBuildAST {
        private final FNCBuildAST list1;
        private final FNCBuildAST list2;

        public ListAppend(FNCBuildAST list1, FNCBuildAST list2) {
            this.list1 = list1;
            this.list2 = list2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new ListListAppendNode(list1.buildAST(l), list2.buildAST(l));
        }
    }

    @NodeInfo(description = "List List2 Node")
    class ListList2Node extends FNCExpressionNode {

        @Child
        private FNCExpressionNode xe;

        public ListList2Node(FNCExpressionNode xe) {
            this.xe = xe;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return ValueFactory.getInstance().list((IValue) xe.executeGeneric(frame));
        }
    }

    @NodeInfo(description = "List List3 Node")
    class ListList3Node extends FNCExpressionNode {

        @Child
        private FNCExpressionNode xe1;

        @Child
        private FNCExpressionNode xe2;

        public ListList3Node(FNCExpressionNode xe1, FNCExpressionNode xe2) {
            this.xe1 = xe1;
            this.xe2 = xe2;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return ValueFactory.getInstance().list((IValue) xe1.executeGeneric(frame), (IValue) xe2.executeGeneric(frame));
        }
    }

    @NodeInfo(description = "List ListHead Node")
    class ListListHeadNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode list2;

        public ListListHeadNode(FNCExpressionNode list2) {
            this.list2 = list2;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return ((IList) list2.executeGeneric(frame)).get(0);
        }
    }

    @NodeInfo(description = "List ListTail Node")
    class ListListTailNode extends FNCExpressionNode {
        @Child
        private FNCExpressionNode list2;

        public ListListTailNode(FNCExpressionNode list2) {
            this.list2 = list2;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IList listVal = ((IList) list2.executeGeneric(frame));
            if (listVal.length() <= 1) {
                return ValueFactory.getInstance().list();
            }
            return listVal.sublist(1, listVal.length() - 1);
        }
    }
}