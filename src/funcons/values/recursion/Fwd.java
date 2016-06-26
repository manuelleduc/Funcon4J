package funcons.values.recursion;

import funcons.values.properties.ExternalRascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

public class Fwd implements Value, ExternalRascalValue {
    private static java.lang.Integer fwdCount = 0;
    private final java.lang.Integer n;

    private Value value;

    public Fwd() {
        this.n = fwdCount;
        fwdCount++;
    }

    public void add(Value v) {
        value = v;
    }

    public Value follow() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Fwd && ((Fwd)obj).n.equals(this.n);
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public int hashCode() {
        return n.hashCode();
    }

    @Override
    public String toString() {
        return "Fwd:" + n;
    }
}
