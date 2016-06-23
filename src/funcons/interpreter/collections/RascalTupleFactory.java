package funcons.interpreter.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;
import funcons.values.properties.Value;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.ITuple;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

import java.util.ArrayList;
import java.util.List;

public interface RascalTupleFactory extends
        PatternAlg<IEval>,
        MapAlg<IEval>,
        SupplyGivenAlg<IEval>,
        FunctionAlg<IEval>,
        TupleAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval tuple() {
        return (env, forwards, store, given) -> vf.tuple();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, forwards, store, given) -> vf.tuple((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, forwards, store, given) -> vf.tuple(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, forwards, store, given) -> vf.tuple(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given),
                (IValue)x3.eval(env, forwards, store, given)
        );
    }

    @Override
    default IEval tuplePrefix(IEval x, IEval tup) {
        return (env, forwards, store, given) -> {
            ITuple tupVal = (ITuple)tup.eval(env, forwards, store, given);
            IValue xVal = (IValue)x.eval(env, forwards, store, given);
            List<IValue> tupElems = new ArrayList<>();
            tupElems.add(xVal);
            for (IValue tupElem : tupVal) {
                tupElems.add(tupElem);
            }
            return vf.tuple(tupElems.toArray(new IValue[tupElems.size()]));
        };
    }

    @Override
    default IEval tupleHead(IEval tup) {
        return (env, forwards, store, given) -> ((ITuple)tup.eval(env, forwards, store, given)).get(0);
    }

    @Override
    default IEval tupleTail(IEval tup) {
        return (env, forwards, store, given) -> {
            ITuple tupVal = (ITuple)tup.eval(env, forwards, store, given);
            List<IValue> tupElems = new ArrayList<>();
            boolean isFirst = true;
            for (IValue tupElem : tupVal) {
                if (isFirst) {
                    isFirst = false;
                    continue;
                }
                tupElems.add(tupElem);
            }
            return vf.tuple(tupElems.toArray(new IValue[tupElems.size()]));
        };
    }

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, forwards, store, given) ->
                ((ITuple)tup.eval(env, forwards, store, given))
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
