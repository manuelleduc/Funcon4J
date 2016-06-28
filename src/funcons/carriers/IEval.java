package funcons.carriers;

import funcons.values.Null;
import funcons.values.signals.FunconException;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface IEval {
    ValueFactory vf = ValueFactory.getInstance();

    IValue eval(IMap env, IValue given) throws FunconException;

    default IValue eval() throws FunconException {
        return eval(vf.mapWriter().done(), new Null());
    }
}