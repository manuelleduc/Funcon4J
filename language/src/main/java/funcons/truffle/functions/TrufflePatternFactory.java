package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TrufflePatternFactory extends
        BoolAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        ExceptionAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        PatternAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST only(FNCBuildAST v) {
        return abs(ifTrue(equal(given(), v), environment(), fail()));
    }

    @Override
    default FNCBuildAST any() {
        return abs(environment());
    }

    @Override
    default FNCBuildAST match(FNCBuildAST exp, FNCBuildAST pat) {
        return apply(pat, exp);
    }

    @Override
    default FNCBuildAST pattAbs(FNCBuildAST pat, FNCBuildAST x) {
        return abs(scope(match(given(), pat), x));
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST pattUnion(FNCBuildAST pat1, FNCBuildAST pat2) {
        return l -> {
            final FNCExpressionNode pate1 = pat1.buildAST(l);
            PatternPattUnion1Node patternPattUnion1Node = new PatternPattUnion1Node(pate1);
            final FNCExpressionNode pate2 = pat2.buildAST(l);
            final PatternPattUnion2Node patternPattUnion2Node = new PatternPattUnion2Node(pate2);
            final FNCExpressionNode fncExpressionNode = mapUnion(lo -> {
                return patternPattUnion1Node;
            }, lo1 -> {
                return patternPattUnion2Node;
            }).buildAST(l);
            return abs(z -> fncExpressionNode).buildAST(l);
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST pattNonBinding(FNCBuildAST patt) {
        return l -> {
            final FNCExpressionNode patte = patt.buildAST(l);
            final FNCExpressionNode enve = environment().buildAST(l);
            PatternPattNonBindingNode patternPattNonBindingNode = new PatternPattNonBindingNode(patte, enve);
            return abs(x -> patternPattNonBindingNode).buildAST(l);
        };
    }

    @NodeInfo(description = "Pattern PattUnion 1 Node")
    class PatternPattUnion1Node extends FNCExpressionNode {

        @Child
        private FNCExpressionNode pate1;

        public PatternPattUnion1Node(FNCExpressionNode pate1) {
            this.pate1 = pate1;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return pate1.executeGeneric(frame);
        }
    }

    @NodeInfo(description = "Pattern PattUnion2 Node")
    class PatternPattUnion2Node extends FNCExpressionNode {

        @Child
        private FNCExpressionNode pate2;

        public PatternPattUnion2Node(FNCExpressionNode pate2) {
            this.pate2 = pate2;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return pate2.executeGeneric(frame);
        }
    }

    @NodeInfo(description = "Pattern PattNonBinding Node")
    class PatternPattNonBindingNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode patte;

        @Child
        private FNCExpressionNode enve;

        public PatternPattNonBindingNode(FNCExpressionNode patte, FNCExpressionNode enve) {
            this.patte = patte;
            this.enve = enve;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final Object o = patte.executeGeneric(frame);
            return enve.executeGeneric(frame);
        }
    }
}