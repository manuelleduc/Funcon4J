package funcons.sorts;

import funcons.Store;
import funcons.values.recursion.Forwards;
import funcons.values.signals.FunconException;
import funcons.values.Environment;
import funcons.values.Value;

public interface IEval {
    Value eval(Environment env, Forwards forward, Store store, Value given) throws FunconException;
}