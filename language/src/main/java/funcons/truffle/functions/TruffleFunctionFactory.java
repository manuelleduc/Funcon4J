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
        return new Abs(exp);
    }

    @Override
    default FNCBuildAST abs(FNCBuildAST patt, FNCBuildAST exp) {

        return l -> {
            final FNCExpressionNode patte = patt.buildAST(l);

            return scope(language -> new FunctionAbsNode(patte), exp).buildAST(l);
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST apply(FNCBuildAST abs, FNCBuildAST arg) {
        /*return (env, given) -> supply(arg,
                ((funcons.values.Abs<IEval>)abs.eval(env, given)).body()).eval(env, given);*/

        return l -> {
            final FNCExpressionNode abse = abs.buildAST(l);
            return supply(arg, z -> new FunctionApplyNode(abse)).buildAST(l);
        };
    }

    @Override
    default FNCBuildAST applyToEach(FNCBuildAST a, FNCBuildAST l) {
/*
return (env, given) -> {
            IValue listVal = l.eval(env, given);
            IEval cachedListEval = (e,g) -> listVal;
            return ifTrue(
                    equal(listLength(cachedListEval), lit(0)),
                    null_(),
                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
            ).eval(env, given);
        };
 */

        return lo -> {
            final FNCExpressionNode le = l.buildAST(lo);

            final FunctionApplyToEachNode applyToEachNpde = new FunctionApplyToEachNode(le);
            applyToEachNpde.e1 = apply(a, listHead(applyToEachNpde.createE1())).buildAST(lo);
            applyToEachNpde.e2 = listTail(applyToEachNpde.createE1()).buildAST(lo);
            return applyToEachNpde;
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

    class Abs implements FNCBuildAST {
        private final FNCBuildAST exp;

        public Abs(FNCBuildAST exp) {
            this.exp = exp;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode(exp.buildAST(l));
        }
    }

    class Close implements FNCBuildAST {
        private final FNCBuildAST abs;

        public Close(FNCBuildAST abs) {
            this.abs = abs;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionCloseNode(abs.buildAST(l), l);
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
            final Object o = patte.executeGeneric(frame);
            if (o instanceof funcons.values.Abs) {
                return ((funcons.values.Abs<Object>) o).body();
            } else {
                return o;
            }

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

            final Object o = abse.executeGeneric(frame);
            if (o instanceof funcons.values.Abs)
                return ((funcons.values.Abs) o).body();
            else return o;
        }
    }
}