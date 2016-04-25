package funcons.sorts;

import funcons.Store;
import funcons.types.signals.FunconException;
import funcons.types.Environment;
import funcons.types.Value;

public interface IEval {
    Value eval(Environment env, Store store, Value given) throws FunconException;
}