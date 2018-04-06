package funcons.truffle.values;

import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleIntFactory extends IntAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode lit(Integer i) {
        return new IntLitNode(i);
    }

    @Override
    default FNCExecuteNode intAdd(FNCExecuteNode a, FNCExecuteNode b) {
        return new IntIntAddNode(a, b);
    }

    @Override
    default FNCExecuteNode intNegate(FNCExecuteNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).toInteger().negate();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode intSubtract(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .subtract(((INumber) b.eval(env, given)).toInteger());
        return new IntIntSubstractNode((FNCExpressionNode) a, (FNCExpressionNode) b);
    }

    @Override
    default FNCExecuteNode intMultiply(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .multiply(((INumber) b.eval(env, given)).toInteger());
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode intDivide(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .divide(((INumber) b.eval(env, given)).toInteger());
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode intModulo(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            IInteger aNumber = ((INumber) a.eval(env, given)).toInteger();
//            IInteger bNumber = ((INumber) b.eval(env, given)).toInteger();
//            return aNumber.subtract(aNumber.divide(bNumber).multiply(bNumber));
//        };
        throw new RuntimeException("Not implemented");
    }
}
