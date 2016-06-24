package funcons.interpreter.types;

import funcons.algebras.types.TupleTypeAlg;
import funcons.carriers.IEval;
import funcons.values.Int;
import funcons.values.types.TupleType;
import funcons.values.types.Type;

public interface TupleTypeFactory extends TupleTypeAlg<IEval> {
    @Override
    default IEval tupleType() {
        return (env, forward, store, given) -> new TupleType();
    }

    @Override
    default IEval tupleType(IEval x) {
        return (env, forward, store, given) ->
                new TupleType((Type)x.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2) {
        return (env, forward, store, given) -> new TupleType(
                (Type)x1.eval(env, forward, store, given),
                (Type)x2.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2, IEval x3) {
        return (env, forward, store, given) -> new TupleType(
                (Type)x1.eval(env, forward, store, given),
                (Type)x2.eval(env, forward, store, given),
                (Type)x3.eval(env, forward, store, given));
    }

    @Override
    default IEval tupleTypePrefix(IEval x, IEval tup) {
        return (env, forward, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, forward, store, given);
            Type t = (Type)x.eval(env, forward, store, given);
            return tt.prepend(t);
        };
    }

    @Override
    default IEval projectType(IEval index, IEval tup) {
        return (env, forward, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, forward, store, given);
            Int i = (Int)index.eval(env, forward, store, given);
            return tt.get(i);
        };
    }
}
