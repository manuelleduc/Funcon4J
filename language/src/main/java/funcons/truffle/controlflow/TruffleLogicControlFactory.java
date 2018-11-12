package funcons.truffle.controlflow;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleLogicControlFactory extends
        NullAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        BoolAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST effect(FNCBuildAST e) {
        return l -> new LogicControlEffectNode(e.buildAST(l), null_().buildAST(l));
    }

    @Override
    default FNCBuildAST seq(FNCBuildAST c, FNCBuildAST t) {
        return new Seq(c, t);
    }

    @Override
    default FNCBuildAST ifTrue(FNCBuildAST e, FNCBuildAST c1, FNCBuildAST c2) {
        return new IfTrue(e, c1, c2);
    }

    @Override
    default FNCBuildAST whileTrue(FNCBuildAST e, FNCBuildAST c) {
        return new WhileTrue(e, c);
    }

    @Override
    default FNCBuildAST for_(FNCBuildAST condl, FNCBuildAST incrl, FNCBuildAST expl) {

        return new For_(z -> null_().buildAST(z), condl, incrl, expl);
    }

    class IfTrue implements FNCBuildAST {
        private final FNCBuildAST e;
        private final FNCBuildAST c1;
        private final FNCBuildAST c2;

        public IfTrue(FNCBuildAST e, FNCBuildAST c1, FNCBuildAST c2) {
            this.e = e;
            this.c1 = c1;
            this.c2 = c2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new LogicControlIfTrueNode(e.buildAST(l), c1.buildAST(l), c2.buildAST(l));
        }
    }

    class Seq implements FNCBuildAST {
        private final FNCBuildAST lhs;
        private final FNCBuildAST rhs;

        public Seq(FNCBuildAST lhs, FNCBuildAST rhs) {
            this.lhs = lhs;
            this.rhs = rhs;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            FNCExpressionNode lhs = this.lhs.buildAST(l);
            FNCExpressionNode rhs = this.rhs.buildAST(l);
            return new LogicControlSeqNode(lhs, rhs);
        }
    }

    class WhileTrue implements FNCBuildAST {
        private final FNCBuildAST e;
        private final FNCBuildAST c;

        public WhileTrue(FNCBuildAST e, FNCBuildAST c) {
            this.e = e;
            this.c = c;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            FNCExpressionNode e = this.e.buildAST(l);
            FNCExpressionNode c = this.c.buildAST(l);
            return new LogicControlWhileTrueNode(e, c);
        }
    }

    class For_ implements FNCBuildAST {
        private final FNCBuildAST a;
        private final FNCBuildAST condl;
        private final FNCBuildAST incrl;
        private final FNCBuildAST expl;

        public For_(FNCBuildAST a, FNCBuildAST condl, FNCBuildAST incrl, FNCBuildAST expl) {
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
