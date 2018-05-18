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
import funcons.values.Abs;

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
//        return abs((env, given) -> {
//            CLExecuteNode env1 = ((Abs<CLExecuteNode>) pat1.eval(env, given)).body();
//            CLExecuteNode env2 = ((Abs<CLExecuteNode>) pat2.eval(env, given)).body();
//            return mapUnion(env1, env2).eval(env, given);
//        });
        return l -> {
            final FNCExpressionNode pate1 = pat1.buildAST(l);
            final FNCExpressionNode pate2 = pat2.buildAST(l);
            return abs(z -> mapUnion(lo -> new PatternPattUnion1Node(pate1), lo -> new PatternPattUnion2Node(pate2)).buildAST(l)).buildAST(l);
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST pattNonBinding(FNCBuildAST patt) {
//        return abs((env, given) -> {
//            ((Abs<CLExecuteNode>) patt.eval(env, given)).body().eval(env, given);
//            return environment().eval(env, given);
//        });
        return l -> {
            final FNCExpressionNode patte = patt.buildAST(l);
            final FNCExpressionNode enve = environment().buildAST(l);
            return abs(x -> new PatternPattNonBindingNode(patte, enve)).buildAST(l);
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
            return ((Abs) pate1.executeGeneric(frame)).body();
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
            return ((Abs) pate2.executeGeneric(frame)).body();
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
            final Object body = ((Abs) patte.executeGeneric(frame)).body();
            return enve.executeGeneric(frame);
        }
    }
}