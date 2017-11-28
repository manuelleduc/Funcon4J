package funcons.values.cl;

import funcons.values.properties.ExternalRascalValue;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.IValue;

public class CLVariant extends RunTimeFunconException implements ExternalRascalValue {

    private final IString tag;
    private final IValue value;

    public CLVariant(IString tag, IValue v) {
        super(tag.toString());
        this.tag = tag;
        this.value = v;
    }

    public IString tag() {
        return tag;
    }

    public IValue value() {
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
