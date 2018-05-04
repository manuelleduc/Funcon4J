package funcons.carriers;

import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface IEval {
    ValueFactory vf = ValueFactory.getInstance();

    IValue eval(IMap env, IValue given) throws FunconException;

    default IValue eval() throws FunconException {
        return eval(vf.mapWriter().done(), new Null());
    }

    default String print() {
        return toString();
    }
}