package funcons.interpreter.functions;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import funcons.values.properties.Value;

public interface CurryFactory extends
        FunctionAlg<IEval>,
        TupleAlg<IEval>,
        IntAlg<IEval>,
        SupplyGivenAlg<IEval>,
        BoolAlg<IEval>,
        LogicControlAlg<IEval>,
        CurryAlg<IEval> {

    @Override
    default IEval partialApp(IEval f, IEval x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default IEval partialAppN(IEval f, IEval x) {
        return abs(apply(f, tuplePrefix(x, given())));
    }

    @Override
    default IEval curry(IEval a) {
        return abs((env, store, given) -> partialApp(a, (e,s,g) -> given).eval(env, store, given));
    }

    @Override
    default IEval curryN(IEval n, IEval a) {
        return (env, store, given) -> {
            Value index = n.eval(env, store, given);
            return ifTrue(
                    equal((e,s,g)->index, lit(0)),
                    apply(a, tuple()),
                    abs((localEnv, localStore, localGiven) -> curryN(
                            intSubtract(n, lit(1)),
                            partialAppN(a, (e,s,g) -> localGiven))
                            .eval(env, store, given)))
                    .eval(env, store, given);
        };
    }

    @Override
    default IEval uncurry(IEval f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

}
