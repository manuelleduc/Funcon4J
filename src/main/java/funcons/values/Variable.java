package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.visitors.IValueVisitor;

public class Variable implements ExternalRascalValue {
    private static java.lang.Integer allocCount = 0;
    private java.lang.Integer loc;
    private IValue value;

    public Variable() {
        this.loc = allocCount;
        allocCount++;
    }

    public Variable(IValue val) {
        this();
        store(val);
    }

    @Override
    public <T, E extends Throwable> T accept(IValueVisitor<T, E> v) throws E {
        return value.accept(v);
    }

    public void store(IValue val) {
        value = val;
    }

    public IValue value() {
        return value;
    }

    @Override
    public int hashCode() {
        return loc;
    }

    @Override
    public String toString() {
        return "Variable@" + loc + "<" + value() + ">";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variable && ((Variable)o).loc.equals(loc);
    }

    @Override
    public boolean isEqual(IValue other) {
        if (other instanceof Variable) {
            return ((Variable) other).value().isEqual(value());
        }
        return other.isEqual(value());
    }
}
