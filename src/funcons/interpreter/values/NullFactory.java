package funcons.interpreter.values;

import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.Undefined;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface NullFactory extends NullAlg<IEval> {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval null_() {
        return (env, given) -> new Null();
    }

    @Override
    default IEval undefined() {
        return (env, given) -> new Undefined();
    }
}
