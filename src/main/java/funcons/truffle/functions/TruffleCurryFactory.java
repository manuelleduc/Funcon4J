package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;

public interface TruffleCurryFactory extends
        FunctionAlg<CLExecuteNode>,
        TupleAlg<CLExecuteNode>,
        IntAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        BoolAlg<CLExecuteNode>,
        LogicControlAlg<CLExecuteNode>,
        CurryAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode partialApp(CLExecuteNode f, CLExecuteNode x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default CLExecuteNode partialAppN(CLExecuteNode f, CLExecuteNode x) {
//        return abs(apply(f, tuplePrefix(x, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode curry(CLExecuteNode a) {
        return new CurryCurryNode(a, this);
    }

    @Override
    default CLExecuteNode curryN(CLExecuteNode n, CLExecuteNode a) {
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

        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode uncurry(CLExecuteNode f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }
}
