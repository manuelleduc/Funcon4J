package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleFunctionFactory extends
        IntAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        LogicControlAlg<CLExecuteNode>,
        ListAlg<CLExecuteNode>,
        BoolAlg<CLExecuteNode>,
        NullAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode abs(CLExecuteNode exp) {
//        return (env, given) -> new Abs<>(exp);
        return new FunctionAbsNode(exp); // TODO
    }

    @Override
    default CLExecuteNode abs(CLExecuteNode patt, CLExecuteNode exp) {
        return new FunctionAbsNode2(patt, exp, this);
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode apply(CLExecuteNode abs, CLExecuteNode arg) {
        return new FunctionApplyNode(abs, arg, this);
    }

    @Override
    default CLExecuteNode applyToEach(CLExecuteNode a, CLExecuteNode l) {
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
    default CLExecuteNode compose(CLExecuteNode f, CLExecuteNode g) {
//        return abs(apply(f, apply(g, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode close(CLExecuteNode abs) {
        return new FunctionCloseNode(abs, this, this);
    }

    @Override
    default CLExecuteNode bind(CLExecuteNode id) {
        return abs(bindValue(id, given()));
    }
}