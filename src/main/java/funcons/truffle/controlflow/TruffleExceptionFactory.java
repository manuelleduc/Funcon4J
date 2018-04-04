package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;

public interface TruffleExceptionFactory extends
        LogicControlAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        ExceptionAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode fail() {
//        return (env, given) -> {
//            throw new FailureTrue();
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode matchFailure() {
//        return (env, given) -> new CLMatchFailureException(vf);
        return null; // TODO
    }

    @Override
    default CLExecuteNode exception(java.lang.String message) {
//        return (env, given) -> new RunTimeFunconException(message);
        return null; // TODO
    }

    @Override
    default CLExecuteNode exception(java.lang.String message, CLExecuteNode val) {
//        return (env, given) -> new RunTimeFunconException(message, val.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode throw_(CLExecuteNode s) {
//        return (env, given) -> {
//            throw (RunTimeFunconException) s.eval(env, given);
//        };
        return new ExceptionThrowNode(s); // TODO
    }

    @Override
    default CLExecuteNode catch_(CLExecuteNode x, CLExecuteNode abs) {
//        return (env, given) -> {
//            try {
//                return x.eval(env, given);
//            } catch (RunTimeFunconException e) {
//                return apply(abs, (env1, given1) -> e).eval(env, given);
//            }
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode catchElseRethrow(CLExecuteNode x, CLExecuteNode abs) {
//        return catch_(x, preferOver(abs, abs(throw_(given()))));
        return null; // TODO
    }

    @Override
    default CLExecuteNode else_(CLExecuteNode x1, CLExecuteNode x2) {
//        return (env, given) -> {
//            try {
//                return x1.eval(env, given);
//            } catch (FailureTrue f) {
//                return x2.eval(env, given);
//            }
//        };
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode preferOver(CLExecuteNode a1, CLExecuteNode a2) {
//        return (env, given) ->
//                abs(else_(
//                        ((Abs<CLExecuteNode>) a1.eval(env, given)).body(),
//                        ((Abs<CLExecuteNode>) a2.eval(env, given)).body()
//                )).eval(env, given);
        return null; // TODO
    }


    @Override
    default CLExecuteNode whenTrue(CLExecuteNode exp, CLExecuteNode x) {
//        return ifTrue(exp, x, fail());
        return null; // TODO
    }
}
