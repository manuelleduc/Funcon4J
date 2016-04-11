package funcons.sorts;

import funcons.signals.Signal;
import funcons.types.Environment;
import funcons.types.Value;

public interface IEval {
    Value eval(Environment env, Value given) throws Signal;
}