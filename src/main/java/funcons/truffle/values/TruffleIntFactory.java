package funcons.truffle.values;

import funcons.algebras.values.IntAlg;
import funcons.truffle.entities.BindingBindValueNode;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;

public interface TruffleIntFactory extends IntAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode lit(Integer i) {
        return new Lit(i);
    }

    @Override
    default FNCExecuteNode intAdd(FNCExecuteNode a, FNCExecuteNode b) {
        return new IntAdd(a, b);
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
        return new IntSubstract(a, b);
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

    class IntAdd implements FNCExecuteNode {
        private final FNCExecuteNode a;
        private final FNCExecuteNode b;

        public IntAdd(FNCExecuteNode a, FNCExecuteNode b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            FNCExpressionNode a1 = (FNCExpressionNode) a.buildAST(l);
            FNCExpressionNode b1 = (FNCExpressionNode) b.buildAST(l);
            return IntIntAddNodeGen.create(a1, b1);
        }
    }

    class Lit implements FNCExecuteNode {
        private final Integer i;

        public Lit(Integer i) {
            this.i = i;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new IntLitNode(i);
        }
    }

    class IntSubstract implements FNCExecuteNode {
        private final FNCExecuteNode a;
        private final FNCExecuteNode b;

        public IntSubstract(FNCExecuteNode a, FNCExecuteNode b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new IntIntSubstractNode((FNCExpressionNode) a, (FNCExpressionNode) b);
        }
    }
}
