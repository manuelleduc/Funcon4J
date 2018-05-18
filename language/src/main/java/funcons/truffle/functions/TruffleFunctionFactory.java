package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleFunctionFactory extends
        IntAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        BoolAlg<FNCExecuteNode>,
        NullAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode> {

    /**
     * Anonymoust
     *
     * @param exp
     * @return
     */
    @Override
    default FNCExecuteNode abs(FNCExecuteNode exp) {
        return new Abs(exp);
    }

    @Override
    default FNCExecuteNode abs(FNCExecuteNode patt, FNCExecuteNode exp) {

        return l -> {
            final FNCExpressionNode patte = (FNCExpressionNode) patt.buildAST(l);

            return scope(language -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return ((funcons.values.Abs<Object>) patte.executeGeneric(frame)).body();
                }
            }, exp).buildAST(l);
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode apply(FNCExecuteNode abs, FNCExecuteNode arg) {
        return new Apply(abs, arg, this);
    }

    @Override
    default FNCExecuteNode applyToEach(FNCExecuteNode a, FNCExecuteNode l) {


        return m -> {

            final FNCExpressionNode l2 = (FNCExpressionNode) l.buildAST(m);

            // TODO: extract to its own class
            final FNCExecuteNode cachedListEval = n -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return l2.executeGeneric(frame);
                }
            };

            return ifTrue(
                    equal(listLength(cachedListEval), lit(0)),
                    null_(),
                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
            ).buildAST(m);
        };
    }

    @Override
    default FNCExecuteNode compose(FNCExecuteNode f, FNCExecuteNode g) {
        return abs(apply(f, apply(g, given())));
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode close(FNCExecuteNode abs) {
        return new Close(abs);
    }

    @Override
    default FNCExecuteNode bind(FNCExecuteNode id) {
        return abs(bindValue(id, given()));
    }

    class Abs implements FNCExecuteNode {
        private final FNCExecuteNode exp;

        public Abs(FNCExecuteNode exp) {
            this.exp = exp;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode((FNCExpressionNode) exp.buildAST(l));
        }
    }

    class Abs2 implements FNCExecuteNode {
        private final FNCExecuteNode patt;
        private final FNCExecuteNode exp;

        public Abs2(FNCExecuteNode patt, FNCExecuteNode exp) {
            this.patt = patt;
            this.exp = exp;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode2((FNCExpressionNode) patt.buildAST(l), (FNCExpressionNode) exp.buildAST(l));
        }
    }

    class Close implements FNCExecuteNode {
        private final FNCExecuteNode abs;

        public Close(FNCExecuteNode abs) {
            this.abs = abs;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionCloseNode((FNCExpressionNode) abs.buildAST(l), l);
        }
    }

    class Apply implements FNCExecuteNode {
        private final FNCExecuteNode abs;
        private final FNCExecuteNode arg;
        private final TruffleFunctionFactory f;

        public Apply(FNCExecuteNode abs, FNCExecuteNode arg, TruffleFunctionFactory f) {
            this.abs = abs;
            this.arg = arg;
            this.f = f;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
//            return (env, given) -> supply(arg,
//                    ((funcons.values.Abs<IEval>)abs.eval(env, given)).body()).eval(env, given);

            return f.supply(arg, abs).buildAST(l);
        }
    }
}