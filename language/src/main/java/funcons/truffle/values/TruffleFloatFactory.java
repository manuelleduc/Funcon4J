package funcons.truffle.values;

import funcons.algebras.values.FloatAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleFloatFactory extends FloatAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST lit(Double i) {
        return new Lit(i);
    }

    @Override
    default FNCBuildAST floatAdd(FNCBuildAST a, FNCBuildAST b) {
        return l -> FloatFloatAddNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCBuildAST floatNegate(FNCBuildAST x) {
        return l -> FloatFloatNegateNodeGen.create(x.buildAST(l));
    }

    @Override
    default FNCBuildAST floatSubtract(FNCBuildAST a, FNCBuildAST b) {
        return l -> FloatFloatSubstractNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCBuildAST floatMultiply(FNCBuildAST a, FNCBuildAST b) {
        return l -> FloatFloatMultiplyNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCBuildAST floatDivide(FNCBuildAST a, FNCBuildAST b) {
        return l -> FloatFloatDivideNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    @Override
    default FNCBuildAST floatModulo(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST floatPowerOf(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.toReal(5).pow(bVal.toReal(5), 5);
//        };
        return l -> FloatFloatPowerOfNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    class Lit implements FNCBuildAST {
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
