package funcons.types;

public class Bool implements Number {

    private java.lang.Boolean value;

    public Bool(java.lang.Boolean b) {
        value = b;
    }

    @Override
    public java.lang.Integer intValue() {
        return value ? 1 : 0;
    }

    @Override
    public java.lang.Boolean boolValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Bool && ((Bool) other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value.toString();
    }
}