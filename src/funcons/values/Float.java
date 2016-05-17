package funcons.values;

public class Float implements Number {

    private Double value;

    public Float(java.lang.Double d) {
        value = d;
    }

    @Override
    public Integer intValue() {
        return value.intValue();
    }

    @Override
    public Boolean boolValue() {
        return value.intValue() != 0;
    }

    @Override
    public Double floatValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Float && ((Float)other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value.toString();
    }
}
