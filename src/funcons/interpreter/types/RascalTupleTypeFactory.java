package funcons.interpreter.types;

import funcons.algebras.types.TupleTypeAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalTupleTypeFactory extends TupleTypeAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval tupleType() {
        return (env, forwards, store, given) -> vf.list();
    }

    @Override
    default IEval tupleType(IEval x) {
        return (env, forwards, store, given) -> vf.list((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2) {
        return (env, forwards, store, given) -> vf.list(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2, IEval x3) {
        return (env, forwards, store, given) -> vf.list(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given),
                (IValue)x3.eval(env, forwards, store, given));
    }

    @Override
    default IEval tupleTypePrefix(IEval x, IEval tup) {
        return (env, forwards, store, given) ->
                ((IList)tup.eval(env, forwards, store, given))
                        .insert((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval projectType(IEval index, IEval tup) {
        return (env, forwards, store, given) ->
                ((IList)tup.eval(env, forwards, store, given))
                        .get(((IInteger)index.eval(env, forwards, store, given)).intValue());
    }
}
