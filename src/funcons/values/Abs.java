package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

public class Abs<E> implements Value, ExternalRascalValue {

    private final E body;

    public Abs(E body) {
        this.body = body;
    }

    public E body() {
        return body;
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public boolean isEqual(IValue other) {
        return other == this;
    }

    @Override
    public int hashCode() {
        return body().hashCode();
    }

    @Override
    public java.lang.String toString() {
        return "ABS: " + body.toString();
    }
}
