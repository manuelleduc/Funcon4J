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
        return (env, forward, store, given) -> new Abs<>(exp);
    }

    @Override
    default IEval abs(IEval patt, IEval exp) {
        return (env, forward, store, given) -> new Abs<IEval>((e, f, s, g) -> {
            @SuppressWarnings("unchecked")
            IEval environment = ((Abs<IEval>)patt.eval(e, f, s, g)).body();
            return scope(environment, exp).eval(e, f, s, g);
        });
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval apply(IEval abs, IEval arg) {
        return (env, forward, store, given) -> supply(arg,
                ((Abs<IEval>)abs.eval(env, forward, store, given)).body()).eval(env, forward, store, given);
    }

    @Override
    default IEval applyToEach(IEval a, IEval l) {
        return (env, forward, store, given) -> {
            Value listVal = l.eval(env, forward, store, given);
            IEval cachedListEval = (e,f,s,g) -> listVal;
            return ifTrue(
                    equal(listLength(cachedListEval), lit(0)),
                    null_(),
                    seq(apply(a, listHead(cachedListEval)), applyToEach(a, listTail(cachedListEval)))
            ).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval compose(IEval f, IEval g) {
        return abs(apply(f, apply(g, given())));
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval close(IEval abs) {
        return (env, forward, store, given) ->
                abs(closure(
                        ((Abs<IEval>)abs.eval(env, forward, store, given)).body(),
                        (e, f, s, g) -> env)).eval(env, forward, store, given);
    }

    @Override
    default IEval bind(IEval id) {
        return abs(bindValue(id, given()));
    }
}
