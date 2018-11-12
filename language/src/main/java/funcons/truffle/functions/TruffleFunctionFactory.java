package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.values.NullNullNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;

public interface TruffleFunctionFactory extends
        IntAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST>,
        ListAlg<FNCBuildAST>,
        BoolAlg<FNCBuildAST>,
        NullAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST> {

    /**
     * Anonymoust
     *
     * @param exp
     * @return
     */
    @Override
    default FNCBuildAST abs(FNCBuildAST exp) {
        /*TruffleFunctionFactory c = this;
        System.out.println("abs " + this + " called");*/
        return l -> {
            return new FunctionAbsNode(exp.buildAST(l));
        };
    }

    @Override
    default FNCBuildAST abs(FNCBuildAST patt, FNCBuildAST exp) {

        return new FNCBuildAST() {
            @Override
            public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
                final FNCExpressionNode patte = patt.buildAST(l);
                final FunctionAbsNode functionAbsNode = new FunctionAbsNode(patte);
                return scope(language -> functionAbsNode, exp).buildAST(l);
            }
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST apply(FNCBuildAST abs, FNCBuildAST arg) {

        return l -> {
            final FNCExpressionNode abse = abs.buildAST(l);
            final FunctionApplyNode functionApplyNode = new FunctionApplyNode(abse);
            return supply(arg, z -> functionApplyNode).buildAST(l);
        };
    }

    @Override
    default FNCBuildAST applyToEach(FNCBuildAST a, FNCBuildAST l) {


        return new FNCBuildAST() {
            @Override
            public FNCExpressionNode buildAST(FNCLanguage lo) throws RunTimeFunconException {
                final FNCExpressionNode le = l.buildAST(lo);

                final FunctionApplyToEachNode applyToEachNode = new FunctionApplyToEachNode(le);
                applyToEachNode.e1 = apply(a, listHead(applyToEachNode.createE1())).buildAST(lo);
                applyToEachNode.e2 = listTail(applyToEachNode.createE1()).buildAST(lo);
                return applyToEachNode;
            }
        };
    }

    @Override
    default FNCBuildAST compose(FNCBuildAST f, FNCBuildAST g) {
        return abs(apply(f, apply(g, given())));
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST close(FNCBuildAST abs) {
        return new Close(abs);
    }

    @Override
    default FNCBuildAST bind(FNCBuildAST id) {
        return abs(bindValue(id, given()));
    }

    /*class Abs implements FNCBuildAST {
        private final FNCExpressionNode exp;

        public Abs(FNCExpressionNode exp) {
            this.exp = exp;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode(exp);
        }
    }*/

    class Close implements FNCBuildAST {
        private final FNCBuildAST abs;

        public Close(FNCBuildAST abs) {
            this.abs = abs;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            FNCExpressionNode abs = this.abs.buildAST(l);
            return new FunctionCloseNode(abs, l);
        }
    }

    @NodeInfo(description = "Function ApplyToEach Node")
    class FunctionApplyToEachNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode le;

        @Child
        private FNCExpressionNode e1;

        @Child
        private FNCExpressionNode e2;

        private IList listVal;

        public FunctionApplyToEachNode(FNCExpressionNode le) {
            this.le = le;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.listVal = (IList) le.executeGeneric(frame);
            while (listVal.length() != 0) {
                this.e1.executeGeneric(frame);
                listVal = (IList) this.e2.executeGeneric(frame);
            }
            return new NullNullNode().executeGeneric(frame);
        }

        public FNCBuildAST createE1() {
            return language -> new FunctionApplyToEachSubnode();
        }

        @NodeInfo(description = "Function ApplyToEach Subnode")
        private class FunctionApplyToEachSubnode extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return listVal;
            }
        }
    }

    @NodeInfo(description = "Function Abs Node")
    class FunctionAbsNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode patte;

        public FunctionAbsNode(FNCExpressionNode patte) {
            this.patte = patte;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return patte.executeGeneric(frame);
        }
    }

    @NodeInfo(description = "Function Apply Node")
    class FunctionApplyNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode abse;

        public FunctionApplyNode(FNCExpressionNode abse) {
            this.abse = abse;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return abse.executeGeneric(frame);
        }
    }
}