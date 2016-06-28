package funcons.values.signals;

import funcons.values.properties.ExternalRascalValue;
import org.rascalmpl.value.IValue;

public abstract class FunconException extends Exception implements ExternalRascalValue {
    private java.lang.String message;

    public FunconException(java.lang.String message) {
        super(message);
        this.message = message;
    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof FunconException && ((FunconException)obj).message.equals(message);
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }
}
