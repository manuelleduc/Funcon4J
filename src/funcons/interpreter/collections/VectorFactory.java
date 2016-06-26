package funcons.interpreter.collections;

import funcons.algebras.collections.VectorAlg;
import funcons.algebras.storage.StoreAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface VectorFactory extends StoreAlg<IEval>, VectorAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval vector() {
        return (env, store, given) -> vf.list();
    }

    @Override
    default IEval vector(IEval val) {
        return (env, store, given) -> vf.list((IValue)alloc(val).eval(env, store, given));
    }

    @Override
    default IEval vectorSelect(IEval vector, IEval index) {
        return (env, store, given) -> {
            IList vectorVal = (IList)vector.eval(env, store, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, store, given)).intValue());
            return assignedValue((e,s,g)->var).eval(env, store, given);
        };
    }

    @Override
    default IEval vectorAppend(IEval vector1, IEval vector2) {
        return (env, store, given) -> {
            IList vector1Val = (IList)vector1.eval(env, store, given);
            IList vector2Val = (IList)vector2.eval(env, store, given);
            return vector1Val.concat(vector2Val);
        };
    }

    @Override
    default IEval vectorLength(IEval vector) {
        return (env, store, given) ->
                vf.integer(((IList)vector.eval(env, store, given)).length());
    }

    @Override
    default IEval vectorAssign(IEval vector, IEval index, IEval val) {
        return (env, store, given) -> {
            IList vectorVal = (IList)vector.eval(env, store, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, store, given)).intValue());
            return assign((e,s,g)->var, val).eval(env, store, given);
        };
    }
}
