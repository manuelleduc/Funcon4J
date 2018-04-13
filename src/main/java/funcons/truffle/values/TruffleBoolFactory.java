package funcons.truffle.values;

import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleBoolFactory extends BoolAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode bool(Boolean b) {
//        return (env, given) -> vf.bool(b);
        return l -> new BoolBoolNode(b); // TODO
    }

    @Override
    default FNCExecuteNode not(FNCExecuteNode b) {
        return l -> new BoolNotNode((FNCExpressionNode) b);
    }

    @Override
    default FNCExecuteNode greater(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            IValue aVal = (IValue)a.eval(env, given);
//            IValue bVal = (IValue)b.eval(env, given);
//            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//        };
        return l -> new BoolGreaterNode((FNCExpressionNode) a.buildAST(l), (FNCExpressionNode) b.buildAST(l));
    }

    @Override
    default FNCExecuteNode smaller(FNCExecuteNode a, FNCExecuteNode b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default FNCExecuteNode greaterEqual(FNCExecuteNode a, FNCExecuteNode b) {
        return l -> new BoolGreaterEqualNode((FNCExpressionNode) a, (FNCExpressionNode) b);
    }

    @Override
    default FNCExecuteNode smallerEqual(FNCExecuteNode a, FNCExecuteNode b) {
//        return not(greater(a, b));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode equal(FNCExecuteNode e1, FNCExecuteNode e2) {
        return l -> BoolEqualNodeGen.create((FNCExpressionNode) e1, (FNCExpressionNode) e2);
    }

    @Override
    default FNCExecuteNode physicalEqual(FNCExecuteNode e1, FNCExecuteNode e2) {
//        return (env, given) ->
//                vf.bool(e1.eval(env, given) == e2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }
}
