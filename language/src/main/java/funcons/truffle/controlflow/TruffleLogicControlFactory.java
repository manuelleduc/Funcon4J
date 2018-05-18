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
        return l -> new LogicControlEffectNode(e.buildAST(l), null_().buildAST(l));
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

        return new For_(z -> null_().buildAST(z), condl, incrl, expl);
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            final FNCExpressionNode e1 = e.buildAST(l);
            final FNCExpressionNode c11 = c1.buildAST(l);
            final FNCExpressionNode c21 = c2.buildAST(l);
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new LogicControlSeqNode(c.buildAST(l), t.buildAST(l));
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new LogicControlWhileTrueNode(e.buildAST(l), c.buildAST(l));
        }
    }

    class For_ implements FNCExecuteNode {
        private final FNCExecuteNode a;
        private final FNCExecuteNode condl;
        private final FNCExecuteNode incrl;
        private final FNCExecuteNode expl;

        public For_(FNCExecuteNode a, FNCExecuteNode condl, FNCExecuteNode incrl, FNCExecuteNode expl) {
            this.a = a;
            this.condl = condl;
            this.incrl = incrl;
            this.expl = expl;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            final FNCExpressionNode ret = a.buildAST(l);
            final FNCExpressionNode cond = condl.buildAST(l);
            final FNCExpressionNode incr = incrl.buildAST(l);
            final FNCExpressionNode exp = expl.buildAST(l);
            return new LogicControlForNode(ret, cond, incr, exp);
        }
    }
}
