package funcons.interpreter.functions;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.IValue;

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
        return abs((env, given) -> partialApp(a, (e,g) -> given).eval(env, given));
    }

    @Override
    default IEval curryN(IEval n, IEval a) {
        return (env, given) -> {
            IValue index = n.eval(env, given);
            return ifTrue(
                    equal((e,g)->index, lit(0)),
                    apply(a, tuple()),
                    abs((localEnv, localGiven) -> curryN(
                            intSubtract(n, lit(1)),
                            partialAppN(a, (e,g) -> localGiven))
                            .eval(env, given)))
                    .eval(env, given);
        };
    }

    @Override
    default IEval uncurry(IEval f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

}
