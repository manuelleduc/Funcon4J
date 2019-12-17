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

public interface TruffleExceptionFactory extends
        LogicControlAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        ExceptionAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST fail() {
        return new Fail();
    }

    @Override
    default FNCBuildAST matchFailure() {
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
        return l -> {

            final FNCExpressionNode xe = x.buildAST(l);
            final FNCExpressionNode abse = abs.buildAST(l);
            final ExceptionCatchNode catchNode = new ExceptionCatchNode(xe);
            final FNCExpressionNode excpt = apply(abs, z -> catchNode.buildA()).buildAST(l);
            catchNode.excpt = excpt;
            return catchNode;
        };
    }

    @Override
    default FNCBuildAST catchElseRethrow(FNCBuildAST x, FNCBuildAST abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
    }

    @Override
    default FNCBuildAST else_(FNCBuildAST x1, FNCBuildAST x2) {
        return new Else_(x1, x2);
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCBuildAST preferOver(FNCBuildAST a1, FNCBuildAST a2) {
        return l -> {
            final FNCExpressionNode a1e = a1.buildAST(l);
            ExceptionPrefereOverNode exceptionPrefereOverNode = new ExceptionPrefereOverNode(a1e);
            final FNCExpressionNode a2e = a2.buildAST(l);
            ExceptionPreferOver2Node exceptionPreferOver2Node = new ExceptionPreferOver2Node(a2e);

            final FNCBuildAST fncBuildAST = language -> {
                return exceptionPrefereOverNode;
            };
            final FNCBuildAST fncBuildAST1 = language -> {
                return exceptionPreferOver2Node;
            };
            return abs(else_(fncBuildAST, fncBuildAST1)).buildAST(l);
        };
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

    class Fail implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionFailNode();
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
            return a1e.executeGeneric(frame);
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
            return a2e.executeGeneric(frame);
        }
    }
}
