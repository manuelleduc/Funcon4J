package funcons.values.cl;

import funcons.values.properties.ExternalRascalValue;
import funcons.values.properties.Value;
import funcons.values.signals.RunTimeFunconException;
import org.rascalmpl.value.IString;
import org.rascalmpl.value.IValue;

public class CLVariant extends RunTimeFunconException implements ExternalRascalValue {

    private final IString tag;
    private final Value value;

    public CLVariant(IString tag, Value v) {
        super(tag.toString());
        this.tag = tag;
        this.value = v;
    }

    public IString tag() {
        return tag;
    }

    public Value value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CLVariant &&
                ((CLVariant)o).tag().equals(tag()) && ((CLVariant)o).value().equals(value());
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public int hashCode() {
        return tag().hashCode() * 37 + value().hashCode();
    }

    @Override
    public String toString() {
        return "Variant(" + tag() + "," + value() + ")";
    }
}
