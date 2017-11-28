package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;
import io.usethesource.vallang.visitors.IValueVisitor;

public class Null implements ExternalRascalValue {
    @Override
    public <T, E extends Throwable> T accept(IValueVisitor<T, E> v) throws E {
        return v.visitString(ValueFactory.getInstance().string(toString()));
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Null;
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public java.lang.String toString() {
        return "NULL";
    }

	@Override
	public boolean match(IValue other) {
		// TODO Auto-generated method stub
		return false;
	}
}
