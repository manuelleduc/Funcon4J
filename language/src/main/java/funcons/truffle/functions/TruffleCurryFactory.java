package funcons.truffle.functions;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.entities.SupplyGivenGivenNode;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleCurryFactory extends
        FunctionAlg<FNCBuildAST>,
        TupleAlg<FNCBuildAST>,
        IntAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        BoolAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST>,
        CurryAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST partialApp(FNCBuildAST f, FNCBuildAST x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default FNCBuildAST partialAppN(FNCBuildAST f, FNCBuildAST x) {
//        return abs(apply(f, tuplePrefix(x, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST curry(FNCBuildAST a) {
        return l -> abs(m -> partialApp(a, n -> new SupplyGivenGivenNode()).buildAST(l)).buildAST(l);
    }

    @Override
    default FNCBuildAST curryN(FNCBuildAST n, FNCBuildAST a) {
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
    default FNCBuildAST uncurry(FNCBuildAST f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    class CurryN implements FNCBuildAST {
        private final FNCBuildAST n;
        private final FNCBuildAST a;

        public CurryN(FNCBuildAST n, FNCBuildAST a) {
            this.n = n;
            this.a = a;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new CurryCurryNNode(n.buildAST(l), a.buildAST(l));
        }
    }

}
