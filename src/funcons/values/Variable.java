package funcons.values;

import funcons.values.properties.ExternalRascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

import java.lang.String;

public class Variable implements Value, ExternalRascalValue {
    private static java.lang.Integer allocCount = 0;
    private java.lang.Integer loc;
    private Value value;

    public Variable() {
        this.loc = allocCount;
        allocCount++;
    }

    public Variable(Value val) {
        this();
        store(val);
    }

    public void store(Value val) {
        value = val;
    }

    public Value value() {
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
            return ((IValue)((Variable) other).value()).isEqual((IValue)value());
        }
        return other.isEqual((IValue)value());
    }
}
