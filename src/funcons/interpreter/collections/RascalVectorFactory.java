package funcons.interpreter.collections;

import funcons.algebras.collections.VectorAlg;
import funcons.algebras.storage.StoreAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalVectorFactory extends StoreAlg<IEval>, VectorAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval vector() {
        return (env, forwards, store, given) -> vf.list();
    }

    @Override
    default IEval vector(IEval val) {
        return (env, forwards, store, given) -> vf.list((IValue)alloc(val).eval(env, forwards, store, given));
    }

    @Override
    default IEval vectorSelect(IEval vector, IEval index) {
        return (env, forwards, store, given) -> {
            IList vectorVal = (IList)vector.eval(env, forwards, store, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, forwards, store, given)).intValue());
            return assignedValue((e,f,s,g)->var).eval(env, forwards, store, given);
        };
    }

    @Override
    default IEval vectorAppend(IEval vector1, IEval vector2) {
        return (env, forwards, store, given) -> {
            IList vector1Val = (IList)vector1.eval(env, forwards, store, given);
            IList vector2Val = (IList)vector2.eval(env, forwards, store, given);
            return vector1Val.concat(vector2Val);
        };
    }

    @Override
    default IEval vectorLength(IEval vector) {
        return (env, forwards, store, given) ->
                vf.integer(((IList)vector.eval(env, forwards, store, given)).length());
    }

    @Override
    default IEval vectorAssign(IEval vector, IEval index, IEval val) {
        return (env, forwards, store, given) -> {
            IList vectorVal = (IList)vector.eval(env, forwards, store, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, forwards, store, given)).intValue());
            return assign((e,f,s,g)->var, val).eval(env, forwards, store, given);
        };
    }
}
