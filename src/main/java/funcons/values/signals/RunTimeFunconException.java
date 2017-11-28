package funcons.values.signals;

import funcons.values.Null;
import io.usethesource.vallang.IValue;

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

	@Override
	public boolean match(IValue other) {
		// TODO Auto-generated method stub
		return false;
	}
}
