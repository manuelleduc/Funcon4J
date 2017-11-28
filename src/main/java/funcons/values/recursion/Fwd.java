package funcons.values.recursion;

import funcons.values.properties.ExternalRascalValue;
import io.usethesource.vallang.IValue;

public class Fwd implements ExternalRascalValue {
    private static java.lang.Integer fwdCount = 0;
    private final java.lang.Integer n;

    private IValue value;

    public Fwd() {
        this.n = fwdCount;
        fwdCount++;
    }

    public void add(IValue v) {
        value = v;
    }

    public IValue follow() {
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

	@Override
	public boolean match(IValue other) {
		// TODO Auto-generated method stub
		return false;
	}
}
