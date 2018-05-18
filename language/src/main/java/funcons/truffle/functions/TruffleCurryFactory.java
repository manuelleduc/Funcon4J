package funcons.truffle.functions;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.entities.SupplyGivenGivenNode;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleCurryFactory extends
        FunctionAlg<FNCExecuteNode>,
        TupleAlg<FNCExecuteNode>,
        IntAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        BoolAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        CurryAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode partialApp(FNCExecuteNode f, FNCExecuteNode x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default FNCExecuteNode partialAppN(FNCExecuteNode f, FNCExecuteNode x) {
//        return abs(apply(f, tuplePrefix(x, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode curry(FNCExecuteNode a) {
        return l -> abs(m -> partialApp(a, n -> new SupplyGivenGivenNode()).buildAST(l)).buildAST(l);
    }

    @Override
    default FNCExecuteNode curryN(FNCExecuteNode n, FNCExecuteNode a) {
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

        return new CurryN(n, a);
    }

    @Override
    default FNCExecuteNode uncurry(FNCExecuteNode f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    class CurryN implements FNCExecuteNode {
        private final FNCExecuteNode n;
        private final FNCExecuteNode a;

        public CurryN(FNCExecuteNode n, FNCExecuteNode a) {
            this.n = n;
            this.a = a;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new CurryCurryNNode(n.buildAST(l), a.buildAST(l));
        }
    }

}
