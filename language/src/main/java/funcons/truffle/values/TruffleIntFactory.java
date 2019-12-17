package funcons.truffle.values;

import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleIntFactory extends IntAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST lit(Integer i) {
        return new Lit(i);
    }

    @Override
    default FNCBuildAST intAdd(FNCBuildAST a, FNCBuildAST b) {
        return new IntAdd(a, b);
    }

    @Override
    default FNCBuildAST intNegate(FNCBuildAST x) {
        return new IntNegate(x);
    }

    @Override
    default FNCBuildAST intSubtract(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .subtract(((INumber) b.eval(env, given)).toInteger());
        return new IntSubstract(a, b);
    }

    @Override
    default FNCBuildAST intMultiply(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .multiply(((INumber) b.eval(env, given)).toInteger());
        return new IntMultiply(a, b);
    }

    @Override
    default FNCBuildAST intDivide(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .divide(((INumber) b.eval(env, given)).toInteger());
        return new IntDivide(a, b);
    }

    @Override
    default FNCBuildAST intModulo(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) -> {
//            IInteger aNumber = ((INumber) a.eval(env, given)).toInteger();
//            IInteger bNumber = ((INumber) b.eval(env, given)).toInteger();
//            return aNumber.subtract(aNumber.divide(bNumber).multiply(bNumber));
//        };
        return l -> IntIntModuloNodeGen.create(a.buildAST(l), b.buildAST(l));
    }

    class IntAdd implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public IntAdd(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            final FNCExpressionNode a1 = a.buildAST(l);
            final FNCExpressionNode b1 = b.buildAST(l);
            return IntIntAddNodeGen.create(a1, b1);
        }
    }

    class Lit implements FNCBuildAST {
        private final Integer i;

        public Lit(Integer i) {
            this.i = i;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new IntLitNode(i);
        }
    }

    class IntSubstract implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public IntSubstract(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return IntIntSubstractNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class IntNegate implements FNCBuildAST {
        private final FNCBuildAST x;

        public IntNegate(FNCBuildAST x) {
            this.x = x;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return IntIntNegateNodeGen.create(x.buildAST(l));
        }
    }

    class IntMultiply implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public IntMultiply(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return IntIntMultiplyNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class IntDivide implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public IntDivide(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return IntIntDivideNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }
}
