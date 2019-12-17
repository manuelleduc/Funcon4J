package funcons.truffle.values;

import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleBoolFactory extends BoolAlg<FNCBuildAST> {
    @Override
    default FNCBuildAST bool(Boolean b) {
//        return (env, given) -> vf.bool(b);
        return new Bool(b); // TODO
    }

    @Override
    default FNCBuildAST not(FNCBuildAST b) {
        return new Not(b);
    }

    @Override
    default FNCBuildAST greater(FNCBuildAST a, FNCBuildAST b) {
//        return (env, given) -> {
//            IValue aVal = (IValue)a.eval(env, given);
//            IValue bVal = (IValue)b.eval(env, given);
//            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//        };
        return new Greater(a, b);
    }

    @Override
    default FNCBuildAST smaller(FNCBuildAST a, FNCBuildAST b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default FNCBuildAST greaterEqual(FNCBuildAST a, FNCBuildAST b) {
        return new GreaterEqual(a, b);
    }

    @Override
    default FNCBuildAST smallerEqual(FNCBuildAST a, FNCBuildAST b) {
        return not(greater(a, b));
    }

    @Override
    default FNCBuildAST equal(FNCBuildAST e1, FNCBuildAST e2) {
        return new Equal(e1, e2);
    }

    @Override
    default FNCBuildAST physicalEqual(FNCBuildAST e1, FNCBuildAST e2) {
//        return (env, given) ->
//                vf.bool(e1.eval(env, given) == e2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    class Bool implements FNCBuildAST {
        private final Boolean b;

        public Bool(Boolean b) {
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BoolBoolNode(b);
        }
    }

    class Not implements FNCBuildAST {
        private final FNCBuildAST b;

        public Not(FNCBuildAST b) {
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BoolNotNode(b.buildAST(l));
        }
    }

    class Greater implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public Greater(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolGreaterNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class GreaterEqual implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST b;

        public GreaterEqual(FNCBuildAST a, FNCBuildAST b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolGreaterEqualNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class Equal implements FNCBuildAST {
        private final FNCBuildAST e1;
        private final FNCBuildAST e2;

        public Equal(FNCBuildAST e1, FNCBuildAST e2) {
            this.e1 = e1;
            this.e2 = e2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolEqualNodeGen.create(e1.buildAST(l), e2.buildAST(l));
        }
    }
}
