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
//        return (env, given) -> new Abs<CLExecuteNode>((e, g) -> {
//            @SuppressWarnings("unchecked")
//            CLExecuteNode environment = ((Abs<CLExecuteNode>) patt.eval(e, g)).body();
//            return scope(environment, exp).eval(e, g);
//        });
        return null; // TODO
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

        return null; // TODO
    }

    @Override
    default CLExecuteNode compose(CLExecuteNode f, CLExecuteNode g) {
//        return abs(apply(f, apply(g, given())));
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode close(CLExecuteNode abs) {
//        return (env, given) ->
//                abs(closure(
//                        ((Abs<CLExecuteNode>) abs.eval(env, given)).body(),
//                        (e, g) -> env)).eval(env, given);
        return null; // TODO
    }

    @Override
    default CLExecuteNode bind(CLExecuteNode id) {
//        return abs(bindValue(id, given()));
        return null; // TODO
    }
}