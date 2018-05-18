package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.Abs;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleExceptionFactory extends
        LogicControlAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        ExceptionAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST fail() {
//        return (env, given) -> {
//            throw new FailureTrue();
//        };
        return new Fail();
    }

    @Override
    default FNCBuildAST matchFailure() {
//        return (env, given) -> new CLMatchFailureException(vf);
        return new MatchFailure();
    }

    @Override
    default FNCBuildAST exception(java.lang.String message) {
//        return (env, given) -> new RunTimeFunconException(message);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST exception(java.lang.String message, FNCBuildAST val) {
//        return (env, given) -> new RunTimeFunconException(message, val.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST throw_(FNCBuildAST s) {
        return new Throw_(s);
    }

    @Override
    default FNCBuildAST catch_(FNCBuildAST x, FNCBuildAST abs) {
//        return (env, given) -> {
//            try {
//                return x.eval(env, given);
//            } catch (RunTimeFunconException e) {
//                return apply(abs, (env1, given1) -> e).eval(env, given);
//            }
//        };
        return l -> {

            final FNCExpressionNode xe = x.buildAST(l);
            final FNCExpressionNode abse = abs.buildAST(l);
            ExceptionCatchNode catchNode = new ExceptionCatchNode(xe);
            final FNCExpressionNode excpt = apply(abs, z -> catchNode.buildA()).buildAST(l);
            catchNode.excpt = excpt;
            return catchNode;
        };
    }

    @Override
    default FNCBuildAST catchElseRethrow(FNCBuildAST x, FNCBuildAST abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
//        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST else_(FNCBuildAST x1, FNCBuildAST x2) {
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
    default FNCBuildAST preferOver(FNCBuildAST a1, FNCBuildAST a2) {
//        (env, given) ->
//                abs(else_(
//                        ((Abs<IEval>)a1.eval(env, given)).body(),
//                        ((Abs<IEval>)a2.eval(env, given)).body()
//                )).eval(env, given);


        return l -> {
            final FNCExpressionNode a1e = a1.buildAST(l);
            final FNCExpressionNode a2e = a2.buildAST(l);

            return abs(else_(language -> new ExceptionPrefereOverNode(a1e), language -> new ExceptionPreferOver2Node(a2e))).buildAST(l);
        };

//        return new PrefereOver(a1, a2, this);
    }


    @Override
    default FNCBuildAST whenTrue(FNCBuildAST exp, FNCBuildAST x) {
        return ifTrue(exp, x, fail());
    }

    class MatchFailure implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionMatchFailureNode();
        }
    }

    class Throw_ implements FNCBuildAST {
        private final FNCBuildAST s;

        public Throw_(FNCBuildAST s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionThrowNode(s.buildAST(l));
        }
    }

    class Else_ implements FNCBuildAST {
        private final FNCBuildAST x1;
        private final FNCBuildAST x2;

        public Else_(FNCBuildAST x1, FNCBuildAST x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionElseNode(x1.buildAST(l), x2.buildAST(l));
        }
    }
//
//    class PreferOver implements FNCExecuteNode {
//        private final FNCExecuteNode a1;
//        private final FNCExecuteNode a2;
//
//        public PreferOver(FNCExecuteNode a1, FNCExecuteNode a2) {
//            this.a1 = a1;
//            this.a2 = a2;
//        }
//
//        @Override
//        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
//            return new ExceptionPrefereOverNode((FNCExpressionNode) a1.buildAST(l), (FNCExpressionNode) a2.buildAST(l));
//        }
//    }

    class Fail implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionFailNode();
        }
    }

    class PrefereOver implements FNCBuildAST {
        private final FNCBuildAST a1;
        private final FNCBuildAST a2;
        private final TruffleExceptionFactory alg;

        public PrefereOver(FNCBuildAST a1, FNCBuildAST a2, TruffleExceptionFactory truffleExceptionFactory) {
            this.a1 = a1;
            this.a2 = a2;
            this.alg = truffleExceptionFactory;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return alg.abs(alg.else_(a1, a2)).buildAST(l);
        }
    }

    @NodeInfo(description = "Exception Catch Node")
    class ExceptionCatchNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode xe;

        @Child
        private FNCExpressionNode excpt;
        private Exception e;

        public ExceptionCatchNode(FNCExpressionNode xe) {
            this.xe = xe;

        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            try {
                return xe.executeGeneric(frame);
            } catch (Exception e) {
                this.e = e;
                return excpt.executeGeneric(frame);
            }
        }

        public FNCExpressionNode buildA() {
            return new ExceptionCatchSubnode1();
        }

        private class ExceptionCatchSubnode1 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return e;
            }
        }
    }

    @NodeInfo(description = "Exception PrefereOver Node")
    class ExceptionPrefereOverNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode a1e;

        public ExceptionPrefereOverNode(FNCExpressionNode a1e) {
            this.a1e = a1e;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final Object o = a1e.executeGeneric(frame);
            if (o instanceof Abs) {
                return ((Abs<Object>) o).body();
            } else {
                return o;
            }
        }
    }

    @NodeInfo(description = "Exception PreferOver 2 Node")
    class ExceptionPreferOver2Node extends FNCExpressionNode {

        @Child
        private FNCExpressionNode a2e;

        public ExceptionPreferOver2Node(FNCExpressionNode a2e) {
            this.a2e = a2e;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final Object o = a2e.executeGeneric(frame);
            if (o instanceof Abs) {
                return ((Abs<Object>) o).body();
            } else {
                return o;
            }
        }
    }
}
