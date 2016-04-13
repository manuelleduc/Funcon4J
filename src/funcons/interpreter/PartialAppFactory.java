package funcons.interpreter;

import funcons.Store;
import funcons.algebras.PartialAppAlg;
import funcons.sorts.IEval;
import funcons.types.*;

public interface PartialAppFactory extends AssignFactory, PartialAppAlg<IEval> {

    @Override
    default IEval tuple() {
        return (env, store, given) -> new Tuple();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, store, given) -> new Tuple(x.eval(env, store, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, store, given) -> new Tuple(
                x1.eval(env, store, given),
                x2.eval(env, store, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, store, given) -> new Tuple(
                x1.eval(env, store, given),
                x2.eval(env, store, given),
                x3.eval(env, store, given)
        );
    }

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, store, given) -> ((Tuple)tup.eval(env, store, given)).get((Int)index.eval(env, store, given));
    }

    @Override
    default IEval partialApp(IEval f, IEval x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default IEval curry(IEval f) {
        //return abs(partialApp(f, given()));

        return abs((env, store, given) -> partialApp(f, (e,s,g) -> given).eval(env, store, given));
        //return abs((env, store, given) -> partialApp(f, (e,s,g) -> given().eval(env, store, given)).eval(env, store, given));
    }
}
