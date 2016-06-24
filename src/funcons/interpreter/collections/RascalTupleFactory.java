package funcons.interpreter.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;
import funcons.values.properties.Value;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalTupleFactory extends
        PatternAlg<IEval>,
        MapAlg<IEval>,
        SupplyGivenAlg<IEval>,
        FunctionAlg<IEval>,
        TupleAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval tuple() {
        return (env, forwards, store, given) -> vf.list();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, forwards, store, given) -> vf.list((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, forwards, store, given) -> vf.list(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, forwards, store, given) -> vf.list(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given),
                (IValue)x3.eval(env, forwards, store, given)
        );
    }

    @Override
    default IEval tuplePrefix(IEval x, IEval tup) {
        return (env, forwards, store, given) ->
                ((IList)tup.eval(env, forwards, store, given))
                        .insert((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval tupleHead(IEval tup) {
        return (env, forwards, store, given) -> ((IList)tup.eval(env, forwards, store, given)).get(0);
    }

    @Override
    default IEval tupleTail(IEval tup) {
        return (env, forwards, store, given) -> {
            IList tupVal = ((IList)tup.eval(env, forwards, store, given));
            if (tupVal.length() <= 1) {
                return vf.list();
            }
            return tupVal.sublist(1, tupVal.length() - 1);
        };
    }

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, forwards, store, given) ->
                ((IList)tup.eval(env, forwards, store, given))
                        .get(((IInteger)index.eval(env, forwards, store, given)).intValue());
    }

    @Override
    default IEval tuplePrefixMatch(IEval tup, IEval p1, IEval p2) {
        return (env, forwards, store, given) -> {
            Value tupVal = tup.eval(env, forwards, store, given);
            return mapUnion(
                    match(tupleHead((e,f,s,g)->tupVal), p1),
                    match(tupleTail((e,f,s,g)->tupVal), p2)
            ).eval(env, forwards, store, given);
        };
    }

    @Override
    default IEval tuplePrefixPatt(IEval p1, IEval p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }
}
