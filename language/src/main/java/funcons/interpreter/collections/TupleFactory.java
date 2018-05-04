package funcons.interpreter.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TupleFactory extends
        PatternAlg<IEval>,
        MapAlg<IEval>,
        SupplyGivenAlg<IEval>,
        FunctionAlg<IEval>,
        TupleAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval tuple() {
        return (env, given) -> vf.list();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, given) -> vf.list((IValue)x.eval(env, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, given) -> vf.list(
                x1.eval(env, given),
                x2.eval(env, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, given) -> vf.list(
                x1.eval(env, given),
                x2.eval(env, given),
                x3.eval(env, given)
        );
    }

    @Override
    default IEval tuplePrefix(IEval x, IEval tup) {
        return (env, given) ->
                ((IList)tup.eval(env, given))
                        .insert(x.eval(env, given));
    }

    @Override
    default IEval tupleHead(IEval tup) {
        return (env, given) -> ((IList)tup.eval(env, given)).get(0);
    }

    @Override
    default IEval tupleTail(IEval tup) {
        return (env, given) -> {
            IList tupVal = ((IList)tup.eval(env, given));
            if (tupVal.length() <= 1) {
                return vf.list();
            }
            return tupVal.sublist(1, tupVal.length() - 1);
        };
    }

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, given) ->
                ((IList)tup.eval(env, given))
                        .get(((IInteger)index.eval(env, given)).intValue());
    }

    @Override
    default IEval tuplePrefixMatch(IEval tup, IEval p1, IEval p2) {
        return (env, given) -> {
            IValue tupVal = tup.eval(env, given);
            return mapUnion(
                    match(tupleHead((e,g)->tupVal), p1),
                    match(tupleTail((e,g)->tupVal), p2)
            ).eval(env, given);
        };
    }

    @Override
    default IEval tuplePrefixPatt(IEval p1, IEval p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }
}
