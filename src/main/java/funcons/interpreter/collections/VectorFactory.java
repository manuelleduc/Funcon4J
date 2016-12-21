package funcons.interpreter.collections;

import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface VectorFactory extends AssignAlg<IEval>, VectorAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval vector() {
        return (env, given) -> vf.list();
    }

    @Override
    default IEval vector(IEval val) {
        return (env, given) -> vf.list((IValue)alloc(val).eval(env, given));
    }

    @Override
    default IEval vectorSelect(IEval vector, IEval index) {
        return (env, given) -> {
            IList vectorVal = (IList)vector.eval(env, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
            return assignedValue((e,g)->var).eval(env, given);
        };
    }

    @Override
    default IEval vectorAppend(IEval vector1, IEval vector2) {
        return (env, given) -> {
            IList vector1Val = (IList)vector1.eval(env, given);
            IList vector2Val = (IList)vector2.eval(env, given);
            return vector1Val.concat(vector2Val);
        };
    }

    @Override
    default IEval vectorLength(IEval vector) {
        return (env, given) ->
                vf.integer(((IList)vector.eval(env, given)).length());
    }

    @Override
    default IEval vectorAssign(IEval vector, IEval index, IEval val) {
        return (env, given) -> {
            IList vectorVal = (IList)vector.eval(env, given);
            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
            return assign((e,g)->var, val).eval(env, given);
        };
    }
}
