package funcons.values;

public class String implements Value {
    private java.lang.String value;

    public String(java.lang.Integer i) {
        value = i.toString();
    }

    public String(java.lang.Boolean b) {
        value = b.toString();
    }

    public String(java.lang.String s) {
        value = s;
    }

    public java.lang.String stringValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof String && ((String) other).value.equals(value);
    }

    @Override
    public java.lang.String toString() {
        return value;
    }
}
