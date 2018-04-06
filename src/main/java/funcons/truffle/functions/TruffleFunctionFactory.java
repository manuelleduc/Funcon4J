package funcons.truffle.functions;

import com.oracle.truffle.api.frame.FrameDescriptor;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.*;

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
        final FrameDescriptor frameDescriptorFact = new FrameDescriptor();
        final FNCFunctionBodyNode fct = new FNCFunctionBodyNode((FNCStatementNode) exp);
        final FNCRootNode rootNode = new FNCRootNode(FNCContext.getInstance().getLanguage(), frameDescriptorFact, fct);

        // TODO: when do we registrer a function,
        //FNCContext.getInstance().getRegistry().register(rootNode);
        return fct;
    }

    @Override
    default FNCExecuteNode abs(FNCExecuteNode patt, FNCExecuteNode exp) {
        return new FunctionAbsNode2(patt, exp, this);
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode apply(FNCExecuteNode abs, FNCExecuteNode arg) {
        return new FunctionApplyNode((FNCExpressionNode) abs, (FNCExpressionNode) arg, this);
    }

    @Override
    default FNCExecuteNode applyToEach(FNCExecuteNode a, FNCExecuteNode l) {
//        return (env, given) -> {
//            IValue listVal = l.eval(env, given);
//            CLExecuteNode cachedListEval = (e, g) -> listVal;
//            return ifTrue(
//                    equal(listLength(cachedListEval), lit(0)),
//                    null_(),
//                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
//            ).eval(env, given);
//        };

        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode compose(FNCExecuteNode f, FNCExecuteNode g) {
//        return abs(apply(f, apply(g, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode close(FNCExecuteNode abs) {
        return new FunctionCloseNode(abs, this, this);
    }

    @Override
    default FNCExecuteNode bind(FNCExecuteNode id) {
        return abs(bindValue(id, given()));
    }
}