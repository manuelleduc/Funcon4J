package funcons.values.signals;

import funcons.values.Null;
import org.rascalmpl.value.IValue;

public class RunTimeFunconException extends FunconException {
    final IValue value;

    public RunTimeFunconException(java.lang.String message) {
        super(message);
        value = new Null();
    }

    public RunTimeFunconException(java.lang.String message, IValue v) {
        super(message);
        value = v;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof RunTimeFunconException &&
                ((RunTimeFunconException)obj).value.equals(value) &&
                super.equals(obj);
    }
}
