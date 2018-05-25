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
            PatternPattUnion1Node patternPattUnion1Node = new PatternPattUnion1Node(pate1);
            final FNCExpressionNode pate2 = pat2.buildAST(l);
            PatternPattUnion2Node patternPattUnion2Node = new PatternPattUnion2Node(pate2);
            return abs(z -> {
                FNCBuildAST fncBuildAST = lo -> {
                    return patternPattUnion1Node;
                };
                FNCBuildAST fncBuildAST1 = lo -> {
                    return patternPattUnion2Node;
                };
                return mapUnion(fncBuildAST, fncBuildAST1).buildAST(l);
            }).buildAST(l);
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
            PatternPattNonBindingNode patternPattNonBindingNode = new PatternPattNonBindingNode(patte, enve);
            return abs(x -> {
                return patternPattNonBindingNode;
            }).buildAST(l);
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
            final Object o = pate1.executeGeneric(frame);
            if (o instanceof Abs)
                return ((Abs) o).body();
            else return o;
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
            final Object o = pate2.executeGeneric(frame);
            if (o instanceof Abs)
                return ((Abs) o).body();
            else return o;
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
            if (o instanceof Abs) {
                final Object body = ((Abs) o).body();
                System.out.println(">>>> " + body);
            }
            return enve.executeGeneric(frame);
        }
    }
}