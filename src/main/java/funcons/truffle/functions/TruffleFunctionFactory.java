package funcons.truffle.functions;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleFunctionFactory extends
        IntAlg<CLStatementNode>,
        SupplyGivenAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        LogicControlAlg<CLStatementNode>,
        ListAlg<CLStatementNode>,
        BoolAlg<CLStatementNode>,
        NullAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode> {

    @Override
    default CLStatementNode abs(CLStatementNode exp) {
//        return (env, given) -> new Abs<>(exp);
        return null; // TODO
    }

    @Override
    default CLStatementNode abs(CLStatementNode patt, CLStatementNode exp) {
//        return (env, given) -> new Abs<CLStatementNode>((e, g) -> {
//            @SuppressWarnings("unchecked")
//            CLStatementNode environment = ((Abs<CLStatementNode>) patt.eval(e, g)).body();
//            return scope(environment, exp).eval(e, g);
//        });
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLStatementNode apply(CLStatementNode abs, CLStatementNode arg) {
//        return (env, given) -> supply(arg,
//                ((Abs<CLStatementNode>) abs.eval(env, given)).body()).eval(env, given);
        return null; // TODO
    }

    @Override
    default CLStatementNode applyToEach(CLStatementNode a, CLStatementNode l) {
//        return (env, given) -> {
//            IValue listVal = l.eval(env, given);
//            CLStatementNode cachedListEval = (e, g) -> listVal;
//            return ifTrue(
//                    equal(listLength(cachedListEval), lit(0)),
//                    null_(),
//                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
//            ).eval(env, given);
//        };

        return null; // TODO
    }

    @Override
    default CLStatementNode compose(CLStatementNode f, CLStatementNode g) {
//        return abs(apply(f, apply(g, given())));
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLStatementNode close(CLStatementNode abs) {
//        return (env, given) ->
//                abs(closure(
//                        ((Abs<CLStatementNode>) abs.eval(env, given)).body(),
//                        (e, g) -> env)).eval(env, given);
        return null; // TODO
    }

    @Override
    default CLStatementNode bind(CLStatementNode id) {
//        return abs(bindValue(id, given()));
        return null; // TODO
    }
}