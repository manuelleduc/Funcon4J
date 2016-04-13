package funcons.sorts;

import funcons.Store;
import funcons.types.FunconException;
import funcons.types.Environment;
import funcons.types.Value;

public interface IEval {
    Value eval(Environment env, Store store, IEval given) throws FunconException;
}