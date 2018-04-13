package funcons.truffle.controlflow;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

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
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode matchFailure() {
//        return (env, given) -> new CLMatchFailureException(vf);
        return new ExceptionMatchFailureNode();
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
        return new ExceptionThrowNode((FNCExpressionNode) s);
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
        return new ExceptionElseNode((FNCExpressionNode) x1, (FNCExpressionNode) x2);
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode preferOver(FNCExecuteNode a1, FNCExecuteNode a2) {
        return new ExceptionPrefereOverNode((FNCExpressionNode) a1, (FNCExpressionNode) a2);
    }


    @Override
    default FNCExecuteNode whenTrue(FNCExecuteNode exp, FNCExecuteNode x) {
//        return ifTrue(exp, x, fail());
        throw new RuntimeException("Not implemented");
    }
}
