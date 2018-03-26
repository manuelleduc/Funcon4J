package funcons.truffle.functions;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleCurryFactory extends
        FunctionAlg<CLStatementNode>,
        TupleAlg<CLStatementNode>,
        IntAlg<CLStatementNode>,
        SupplyGivenAlg<CLStatementNode>,
        BoolAlg<CLStatementNode>,
        LogicControlAlg<CLStatementNode>,
        CurryAlg<CLStatementNode> {

    @Override
    default CLStatementNode partialApp(CLStatementNode f, CLStatementNode x) {
//        return abs(apply(f, tuple(x, given())));
        return null; // TODO
    }

    @Override
    default CLStatementNode partialAppN(CLStatementNode f, CLStatementNode x) {
//        return abs(apply(f, tuplePrefix(x, given())));
        return null; // TODO
    }

    @Override
    default CLStatementNode curry(CLStatementNode a) {
//        return abs((env, given) -> partialApp(a, (e,g) -> given).eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode curryN(CLStatementNode n, CLStatementNode a) {
//        return (env, given) -> {
//            IValue index = n.eval(env, given);
//            return ifTrue(
//                    equal((e,g)->index, lit(0)),
//                    apply(a, tuple()),
//                    abs((localEnv, localGiven) -> curryN(
//                            intSubtract(n, lit(1)),
//                            partialAppN(a, (e,g) -> localGiven))
//                            .eval(env, given)))
//                    .eval(env, given);
//        };

        return null; // TODO
    }

    @Override
    default CLStatementNode uncurry(CLStatementNode f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }
}
