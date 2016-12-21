package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;
import org.rascalmpl.value.visitors.IValueVisitor;

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
}
