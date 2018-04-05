package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleFunctionFactory extends
        IntAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        BoolAlg<FNCExecuteNode>,
        NullAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode abs(FNCExecuteNode exp) {
//        return (env, given) -> new Abs<>(exp);
        return new FunctionAbs(exp); // TODO
    }

    @Override
    default FNCExecuteNode abs(FNCExecuteNode patt, FNCExecuteNode exp) {
        return new FunctionAbsNode2(patt, exp, this);
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode apply(FNCExecuteNode abs, FNCExecuteNode arg) {
        return new FunctionApplyNode(abs, arg, this);
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