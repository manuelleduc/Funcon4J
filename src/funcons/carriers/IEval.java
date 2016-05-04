package funcons.carriers;

import funcons.entities.Store;
import funcons.entities.Forwards;
import funcons.values.signals.FunconException;
import funcons.values.Environment;
import funcons.values.Value;

public interface IEval {
    Value eval(Environment env, Forwards forward, Store store, Value given) throws FunconException;
}