package funcons.sorts;

import funcons.types.FunconException;
import funcons.types.Environment;
import funcons.types.Value;

public interface IEval {
    Value eval(Environment env, Value given) throws FunconException;
}