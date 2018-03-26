package funcons.truffle.controlflow;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleExceptionFactory extends
        LogicControlAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode>,
        SupplyGivenAlg<CLStatementNode>,
        ExceptionAlg<CLStatementNode> {


    @Override
    default CLStatementNode fail() {
//        return (env, given) -> {
//            throw new FailureTrue();
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode matchFailure() {
//        return (env, given) -> new CLMatchFailureException(vf);
        return null; // TODO
    }

    @Override
    default CLStatementNode exception(java.lang.String message) {
//        return (env, given) -> new RunTimeFunconException(message);
        return null; // TODO
    }

    @Override
    default CLStatementNode exception(java.lang.String message, CLStatementNode val) {
//        return (env, given) -> new RunTimeFunconException(message, val.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode throw_(CLStatementNode s) {
//        return (env, given) -> {
//            throw (RunTimeFunconException) s.eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode catch_(CLStatementNode x, CLStatementNode abs) {
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
    default CLStatementNode catchElseRethrow(CLStatementNode x, CLStatementNode abs) {
//        return catch_(x, preferOver(abs, abs(throw_(given()))));
        return null; // TODO
    }

    @Override
    default CLStatementNode else_(CLStatementNode x1, CLStatementNode x2) {
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
    default CLStatementNode preferOver(CLStatementNode a1, CLStatementNode a2) {
//        return (env, given) ->
//                abs(else_(
//                        ((Abs<CLStatementNode>) a1.eval(env, given)).body(),
//                        ((Abs<CLStatementNode>) a2.eval(env, given)).body()
//                )).eval(env, given);
        return null; // TODO
    }


    @Override
    default CLStatementNode whenTrue(CLStatementNode exp, CLStatementNode x) {
//        return ifTrue(exp, x, fail());
        return null; // TODO
    }
}
