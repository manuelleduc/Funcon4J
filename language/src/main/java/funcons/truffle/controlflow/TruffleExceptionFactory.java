package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.Abs;
import funcons.values.signals.RunTimeFunconException;

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
        return l -> {

            final FNCExpressionNode xe = x.buildAST(l);
            final FNCExpressionNode abse = abs.buildAST(l);
            CatchNode catchNode = new CatchNode(xe);
            final FNCExpressionNode excpt = apply(abs, z -> catchNode.buildA()).buildAST(l);
            catchNode.excpt = excpt;
            return catchNode;
        };
    }

    @Override
    default FNCExecuteNode catchElseRethrow(FNCExecuteNode x, FNCExecuteNode abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
//        throw new RuntimeException("Not implemented");
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
//        (env, given) ->
//                abs(else_(
//                        ((Abs<IEval>)a1.eval(env, given)).body(),
//                        ((Abs<IEval>)a2.eval(env, given)).body()
//                )).eval(env, given);


        return l -> {
            final FNCExpressionNode a1e = a1.buildAST(l);
            final FNCExpressionNode a2e = a2.buildAST(l);

            return abs(else_(language -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    final Object o = a1e.executeGeneric(frame);
                    if (o instanceof Abs) {
                        return ((Abs<Object>) o).body();
                    } else {
                        return o;
                    }
                }
            }, language -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    final Object o = a2e.executeGeneric(frame);
                    if (o instanceof Abs) {
                        return ((Abs<Object>) o).body();
                    } else {
                        return o;
                    }
                }
            })).buildAST(l);
        };

//        return new PrefereOver(a1, a2, this);
    }


    @Override
    default FNCExecuteNode whenTrue(FNCExecuteNode exp, FNCExecuteNode x) {
        return ifTrue(exp, x, fail());
    }

    class MatchFailure implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionMatchFailureNode();
        }
    }

    class Throw_ implements FNCExecuteNode {
        private final FNCExecuteNode s;

        public Throw_(FNCExecuteNode s) {
            this.s = s;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionThrowNode(s.buildAST(l));
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

    class Fail implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new ExceptionFailNode();
        }
    }

    class PrefereOver implements FNCExecuteNode {
        private final FNCExecuteNode a1;
        private final FNCExecuteNode a2;
        private final TruffleExceptionFactory alg;

        public PrefereOver(FNCExecuteNode a1, FNCExecuteNode a2, TruffleExceptionFactory truffleExceptionFactory) {
            this.a1 = a1;
            this.a2 = a2;
            this.alg = truffleExceptionFactory;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return alg.abs(alg.else_(a1, a2)).buildAST(l);
        }
    }

    class CatchNode extends FNCExpressionNode {
        private final FNCExpressionNode xe;
        private FNCExpressionNode excpt;
        private Exception e;

        public CatchNode(FNCExpressionNode xe) {
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
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return e;
                }
            };
        }
    }
}
