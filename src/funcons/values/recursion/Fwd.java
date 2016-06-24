package funcons.values.recursion;

import funcons.values.properties.RascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

public class Fwd implements Value, RascalValue {
    private final java.lang.Integer n;

    public Fwd(java.lang.Integer n) {
        this.n = n;
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
        return "Forward:" + n;
    }
}
