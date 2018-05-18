package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.Abs;

public interface TrufflePatternFactory extends
        BoolAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        ExceptionAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        PatternAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode only(FNCExecuteNode v) {
        return abs(ifTrue(equal(given(), v), environment(), fail()));
    }

    @Override
    default FNCExecuteNode any() {
        return abs(environment());
    }

    @Override
    default FNCExecuteNode match(FNCExecuteNode exp, FNCExecuteNode pat) {
        return apply(pat, exp);
    }

    @Override
    default FNCExecuteNode pattAbs(FNCExecuteNode pat, FNCExecuteNode x) {
        return abs(scope(match(given(), pat), x));
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode pattUnion(FNCExecuteNode pat1, FNCExecuteNode pat2) {
//        return abs((env, given) -> {
//            CLExecuteNode env1 = ((Abs<CLExecuteNode>) pat1.eval(env, given)).body();
//            CLExecuteNode env2 = ((Abs<CLExecuteNode>) pat2.eval(env, given)).body();
//            return mapUnion(env1, env2).eval(env, given);
//        });
        return l -> {
            final FNCExpressionNode pate1 = pat1.buildAST(l);
            final FNCExpressionNode pate2 = pat2.buildAST(l);
            return abs(z -> mapUnion(lo -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return ((Abs) pate1.executeGeneric(frame)).body();
                }
            }, lo -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return ((Abs) pate2.executeGeneric(frame)).body();
                }
            }).buildAST(l)).buildAST(l);
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode pattNonBinding(FNCExecuteNode patt) {
//        return abs((env, given) -> {
//            ((Abs<CLExecuteNode>) patt.eval(env, given)).body().eval(env, given);
//            return environment().eval(env, given);
//        });
        return l -> {
            final FNCExpressionNode patte = patt.buildAST(l);
            final FNCExpressionNode enve = environment().buildAST(l);
            return abs(x -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    final Object body = ((Abs) patte.executeGeneric(frame)).body();
                    System.out.println(">>>>>" + body);
                    return enve.executeGeneric(frame);
                }
            }).buildAST(l);
        };
    }
}