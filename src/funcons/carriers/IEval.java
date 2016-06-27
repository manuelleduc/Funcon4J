package funcons.carriers;

import funcons.values.Null;
import funcons.values.properties.Value;
import funcons.values.signals.FunconException;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface IEval {
    ValueFactory vf = ValueFactory.getInstance();

    Value eval(IMap env, Value given) throws FunconException;

    default Value eval() throws FunconException {
        return eval(vf.mapWriter().done(), new Null());
    }

    /*
    Value eval(Environment env, Forwards forward, Store store, Value given) throws FunconException;

    default Value eval() throws FunconException {
        return eval(new Environment(), new Forwards(), new Store(), new Null());
    }*/
}