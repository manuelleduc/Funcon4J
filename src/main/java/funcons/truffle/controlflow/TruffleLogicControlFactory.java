package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IBool;

public interface TruffleLogicControlFactory extends
        NullAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        BoolAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode effect(FNCExecuteNode e) {
        return l -> new LogicControlEffectNode(e.buildAST(l), (FNCExpressionNode) null_().buildAST(l));
    }

    @Override
    default FNCExecuteNode seq(FNCExecuteNode c, FNCExecuteNode t) {
        return new Seq(c, t);
    }

    @Override
    default FNCExecuteNode ifTrue(FNCExecuteNode e, FNCExecuteNode c1, FNCExecuteNode c2) {
        return new IfTrue(e, c1, c2);
    }

    @Override
    default FNCExecuteNode whileTrue(FNCExecuteNode e, FNCExecuteNode c) {
        return new WhileTrue(e, c);
    }

    @Override
    default FNCExecuteNode for_(FNCExecuteNode condl, FNCExecuteNode incrl, FNCExecuteNode expl) {
//        return (env, given) -> {
//            for (; (((IBool) cond.eval(env, given)).getValue()); env = env.join((IMap) incr.eval(env, given))) {
//                exp.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };

        FNCExecuteNode a = (z -> null_().buildAST(z));

        return l -> {
            final FNCExpressionNode ret = (FNCExpressionNode) a.buildAST(l);
            final FNCExpressionNode cond = (FNCExpressionNode) condl.buildAST(l);
            final FNCExpressionNode incr = (FNCExpressionNode) incrl.buildAST(l);
            final FNCExpressionNode exp = (FNCExpressionNode) expl.buildAST(l);
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    // todo env = env.join((IMap) incr.eval(env, given))
                    for (; (((IBool) cond.executeGeneric(frame)).getValue()); incr.executeGeneric(frame)) {
                        exp.executeGeneric(frame);
                    }
                    return ret.executeGeneric(frame);
                }
            };
        };
    }

    class IfTrue implements FNCExecuteNode {
        private final FNCExecuteNode e;
        private final FNCExecuteNode c1;
        private final FNCExecuteNode c2;

        public IfTrue(FNCExecuteNode e, FNCExecuteNode c1, FNCExecuteNode c2) {
            this.e = e;
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            final FNCExpressionNode e1 = (FNCExpressionNode) e.buildAST(l);
            final FNCExpressionNode c11 = (FNCExpressionNode) c1.buildAST(l);
            final FNCExpressionNode c21 = (FNCExpressionNode) c2.buildAST(l);
            return new LogicControlIfTrueNode(e1, c11, c21);
        }
    }

    class Seq implements FNCExecuteNode {
        private final FNCExecuteNode c;
        private final FNCExecuteNode t;

        public Seq(FNCExecuteNode c, FNCExecuteNode t) {
            this.c = c;
            this.t = t;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new LogicControlSeqNode((FNCExpressionNode) c.buildAST(l), (FNCExpressionNode) t.buildAST(l));
        }
    }

    class WhileTrue implements FNCExecuteNode {
        private final FNCExecuteNode e;
        private final FNCExecuteNode c;

        public WhileTrue(FNCExecuteNode e, FNCExecuteNode c) {
            this.e = e;
            this.c = c;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new LogicControlWhileTrueNode((FNCExpressionNode) e, (FNCExpressionNode) c);
        }
    }
}
