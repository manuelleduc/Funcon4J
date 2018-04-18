package funcons.truffle.controlflow;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;

public interface TruffleExceptionFactory extends
        LogicControlAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        ExceptionAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode fail() {
//        return (env, given) -> {
//            throw new FailureTrue();
//        };
        return new Fail();
    }

    @Override
    default FNCExecuteNode matchFailure() {
//        return (env, given) -> new CLMatchFailureException(vf);
        return new MatchFailure();
    }

    @Override
    default FNCExecuteNode exception(java.lang.String message) {
//        return (env, given) -> new RunTimeFunconException(message);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode exception(java.lang.String message, FNCExecuteNode val) {
//        return (env, given) -> new RunTimeFunconException(message, val.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode throw_(FNCExecuteNode s) {
        return new Throw_(s);
    }

    @Override
    default FNCExecuteNode catch_(FNCExecuteNode x, FNCExecuteNode abs) {
//        return (env, given) -> {
//            try {
//                return x.eval(env, given);
//            } catch (RunTimeFunconException e) {
//                return apply(abs, (env1, given1) -> e).eval(env, given);
//            }
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode catchElseRethrow(FNCExecuteNode x, FNCExecuteNode abs) {
//        return catch_(x, preferOver(abs, abs(throw_(given()))));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode else_(FNCExecuteNode x1, FNCExecuteNode x2) {
//        return (env, given) -> {
//            try {
//                return x1.eval(env, given);
//            } catch (FailureTrue f) {
//                return x2.eval(env, given);
//            }
//        };
        return new Else_(x1, x2);
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode preferOver(FNCExecuteNode a1, FNCExecuteNode a2) {
        return new PreferOver(a1, a2);
    }


    @Override
    default FNCExecuteNode whenTrue(FNCExecuteNode exp, FNCExecuteNode x) {
//        return ifTrue(exp, x, fail());
        throw new RuntimeException("Not implemented");
    }

    class MatchFailure implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionMatchFailureNode();
        }
    }

    class Throw_ implements FNCExecuteNode {
        private final FNCExecuteNode s;

        public Throw_(FNCExecuteNode s) {
            this.s = s;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionThrowNode((FNCExpressionNode) s.buildAST(l));
        }
    }

    class Else_ implements FNCExecuteNode {
        private final FNCExecuteNode x1;
        private final FNCExecuteNode x2;

        public Else_(FNCExecuteNode x1, FNCExecuteNode x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionElseNode((FNCExpressionNode) x1, (FNCExpressionNode) x2);
        }
    }

    class PreferOver implements FNCExecuteNode {
        private final FNCExecuteNode a1;
        private final FNCExecuteNode a2;

        public PreferOver(FNCExecuteNode a1, FNCExecuteNode a2) {
            this.a1 = a1;
            this.a2 = a2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionPrefereOverNode((FNCExpressionNode) a1.buildAST(l), (FNCExpressionNode) a2.buildAST(l));
        }
    }

    class Fail implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionFailNode();
        }
    }
}
