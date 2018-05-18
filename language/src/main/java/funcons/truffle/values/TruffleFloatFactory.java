package funcons.truffle.values;

import funcons.algebras.values.FloatAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleFloatFactory extends FloatAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode lit(Double i) {
        return new Lit(i);
    }

    @Override
    default FNCExecuteNode floatAdd(FNCExecuteNode a, FNCExecuteNode b) {
        return l -> FloatFloatAddNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCExecuteNode floatNegate(FNCExecuteNode x) {
        return l -> FloatFloatNegateNodeGen.create(x.buildAST(l));
    }

    @Override
    default FNCExecuteNode floatSubtract(FNCExecuteNode a, FNCExecuteNode b) {
        return l -> new FloatFloatSubstractNode(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCExecuteNode floatMultiply(FNCExecuteNode a, FNCExecuteNode b) {
        return l -> FloatFloatMultiplyNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCExecuteNode floatDivide(FNCExecuteNode a, FNCExecuteNode b) {
        return l -> FloatFloatDivideNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCExecuteNode floatModulo(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatPowerOf(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.toReal(5).pow(bVal.toReal(5), 5);
//        };
        return l -> FloatFloatPowerOfNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    class Lit implements FNCExecuteNode {
        private final Double i;

        public Lit(Double i) {
            this.i = i;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage language) throws RunTimeFunconException {
            return new FloatLitNode(i);
        }
    }
}
