package funcons.interpreter.functions;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Abs;
import funcons.values.properties.Value;

public interface FunctionFactory extends
        IntAlg<IEval>,
        SupplyGivenAlg<IEval>,
        EnvironmentAlg<IEval>,
        LogicControlAlg<IEval>,
        ListAlg<IEval>,
        BoolAlg<IEval>,
        NullAlg<IEval>,
        FunctionAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return (env, store, given) -> new Abs<>(exp);
    }

    @Override
    default IEval abs(IEval patt, IEval exp) {
        return (env, store, given) -> new Abs<IEval>((e, s, g) -> {
            @SuppressWarnings("unchecked")
            IEval environment = ((Abs<IEval>)patt.eval(e, s, g)).body();
            return scope(environment, exp).eval(e, s, g);
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval apply(IEval abs, IEval arg) {
        return (env, store, given) -> supply(arg,
                ((Abs<IEval>)abs.eval(env, store, given)).body()).eval(env, store, given);
    }

    @Override
    default IEval applyToEach(IEval a, IEval l) {
        return (env, store, given) -> {
            Value listVal = l.eval(env, store, given);
            IEval cachedListEval = (e,s,g) -> listVal;
            return ifTrue(
                    equal(listLength(cachedListEval), lit(0)),
                    null_(),
                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
            ).eval(env, store, given);
        };
    }

    @Override
    default IEval compose(IEval f, IEval g) {
        return abs(apply(f, apply(g, given())));
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval close(IEval abs) {
        return (env, store, given) ->
                abs(closure(
                        ((Abs<IEval>)abs.eval(env, store, given)).body(),
                        (e, s, g) -> env)).eval(env, store, given);
    }

    @Override
    default IEval bind(IEval id) {
        return abs(bindValue(id, given()));
    }
}
