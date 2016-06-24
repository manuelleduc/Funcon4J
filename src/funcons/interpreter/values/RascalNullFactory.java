package funcons.interpreter.values;

import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Null;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalNullFactory extends NullAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval null_() {
        return (env, forwards, store, given) -> new Null();
    }

    @Override
    default IEval undefined() {
        return (env, forwards, store, given) -> vf.string("UNDEFINED");
    }
}
