package funcons.truffle.values;

import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleBoolFactory extends BoolAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode bool(Boolean b) {
//        return (env, given) -> vf.bool(b);
        return new Bool(b); // TODO
    }

    @Override
    default FNCExecuteNode not(FNCExecuteNode b) {
        return new Not(b);
    }

    @Override
    default FNCExecuteNode greater(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            IValue aVal = (IValue)a.eval(env, given);
//            IValue bVal = (IValue)b.eval(env, given);
//            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//        };
        return new Greater(a, b);
    }

    @Override
    default FNCExecuteNode smaller(FNCExecuteNode a, FNCExecuteNode b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default FNCExecuteNode greaterEqual(FNCExecuteNode a, FNCExecuteNode b) {
        return new GreaterEqual(a, b);
    }

    @Override
    default FNCExecuteNode smallerEqual(FNCExecuteNode a, FNCExecuteNode b) {
        return not(greater(a, b));
    }

    @Override
    default FNCExecuteNode equal(FNCExecuteNode e1, FNCExecuteNode e2) {
        return new Equal(e1, e2);
    }

    @Override
    default FNCExecuteNode physicalEqual(FNCExecuteNode e1, FNCExecuteNode e2) {
//        return (env, given) ->
//                vf.bool(e1.eval(env, given) == e2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    class Bool implements FNCExecuteNode {
        private final Boolean b;

        public Bool(Boolean b) {
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BoolBoolNode(b);
        }
    }

    class Not implements FNCExecuteNode {
        private final FNCExecuteNode b;

        public Not(FNCExecuteNode b) {
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new BoolNotNode(b.buildAST(l));
        }
    }

    class Greater implements FNCExecuteNode {
        private final FNCExecuteNode a;
        private final FNCExecuteNode b;

        public Greater(FNCExecuteNode a, FNCExecuteNode b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolGreaterNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class GreaterEqual implements FNCExecuteNode {
        private final FNCExecuteNode a;
        private final FNCExecuteNode b;

        public GreaterEqual(FNCExecuteNode a, FNCExecuteNode b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolGreaterEqualNodeGen.create(a.buildAST(l), b.buildAST(l));
        }
    }

    class Equal implements FNCExecuteNode {
        private final FNCExecuteNode e1;
        private final FNCExecuteNode e2;

        public Equal(FNCExecuteNode e1, FNCExecuteNode e2) {
            this.e1 = e1;
            this.e2 = e2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return BoolEqualNodeGen.create(e1.buildAST(l), e2.buildAST(l));
        }
    }
}
