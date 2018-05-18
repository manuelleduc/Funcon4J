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
import funcons.truffle.values.NullNullNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;

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

                    Object o = abse.executeGeneric(frame);
                    if (o instanceof funcons.values.Abs)
                        return ((funcons.values.Abs) o).body();
                    else return o;
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
            FNCExpressionNode le = l.buildAST(lo);

            ApplyToEachNode applyToEachNpde = new ApplyToEachNode(le);
            applyToEachNpde.e1 = apply(a, listHead(applyToEachNpde.createE1())).buildAST(lo);
            applyToEachNpde.e2 = listTail(applyToEachNpde.createE1()).buildAST(lo);
            return applyToEachNpde;
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

    class ApplyToEachNode extends FNCExpressionNode {
        private final FNCExpressionNode le;

        private FNCExpressionNode e1;
        private FNCExpressionNode e2;
        private IList listVal;

        public ApplyToEachNode(FNCExpressionNode le) {
            this.le = le;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.listVal = (IList) le.executeGeneric(frame);
            while (listVal.length() != 0) {
                this.e1.executeGeneric(frame);
                listVal = (IList) this.e2.executeGeneric(frame);
            }
            return new NullNullNode().executeGeneric(frame);
        }

        public FNCExecuteNode createE1() {
            return language -> new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return listVal;
                }
            };
        }
    }
}