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
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;

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
            final FNCExpressionNode patte = patt.buildAST(l);

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
        /*return (env, given) -> supply(arg,
                ((funcons.values.Abs<IEval>)abs.eval(env, given)).body()).eval(env, given);*/

        return l -> {
            FNCExpressionNode abse = abs.buildAST(l);
            return supply(arg, z -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return ((funcons.values.Abs) abse.executeGeneric(frame)).body();
                }
            }).buildAST(l);
        };
    }

    @Override
    default FNCExecuteNode applyToEach(FNCExecuteNode a, FNCExecuteNode l) {
/*
return (env, given) -> {
            IValue listVal = l.eval(env, given);
            IEval cachedListEval = (e,g) -> listVal;
            return ifTrue(
                    equal(listLength(cachedListEval), lit(0)),
                    null_(),
                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
            ).eval(env, given);
        };
 */

        return lo -> {

            final FNCExpressionNode le = l.buildAST(lo);
            final ApplyToEachNode applyToEachNode = new ApplyToEachNode(le);
            final FNCExecuteNode cache = la -> applyToEachNode.getA();
            applyToEachNode.continuation = ifTrue(equal(listLength(cache), lit(0)), null_(), seq(apply(a, listLength(cache)), applyToEach(a, listTail(cache)))).buildAST(lo);
            return applyToEachNode;
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode(exp.buildAST(l));
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionAbsNode2(patt.buildAST(l), exp.buildAST(l));
        }
    }

    class Close implements FNCExecuteNode {
        private final FNCExecuteNode abs;

        public Close(FNCExecuteNode abs) {
            this.abs = abs;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new FunctionCloseNode(abs.buildAST(l), l);
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
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
//            return (env, given) -> supply(arg,
//                    ((funcons.values.Abs<IEval>)abs.eval(env, given)).body()).eval(env, given);

            return null;
        }
    }

    class ApplyToEachNode extends FNCExpressionNode {
        private final FNCExpressionNode le;
        private IValue listVal;
        private FNCExpressionNode continuation;

        public ApplyToEachNode(FNCExpressionNode le) {
            this.le = le;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.listVal = (IValue) le.executeGeneric(frame);
            return continuation.executeGeneric(frame);
        }

        public FNCExpressionNode getA() {
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return listVal;
                }
            };
        }
    }
}