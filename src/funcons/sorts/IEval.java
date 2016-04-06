package funcons.sorts;

import funcons.types.Environment;
import funcons.types.Value;

public interface IEval {
    Value eval(Environment env);
}