package funcons.types;

public class Int implements Number {
    private java.lang.Integer value;

    public Int(java.lang.Number b) {
        value = b.intValue();
    }

    @Override
    public java.lang.Integer intValue() {
        return value;
    }

    @Override
    public java.lang.Boolean boolValue() {
        return value != 0;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Int && ((Int) other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value.toString();
    }
}
