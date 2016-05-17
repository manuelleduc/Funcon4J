package funcons.values;

public interface Number extends Value {
    java.lang.Integer intValue();
    java.lang.Boolean boolValue();
    java.lang.Double floatValue();

    java.lang.Boolean greaterThan(Number other);
    java.lang.Boolean smallerThan(Number other);
    java.lang.Boolean greaterEqualThan(Number other);
    java.lang.Boolean smallerEqualThan(Number other);
}
