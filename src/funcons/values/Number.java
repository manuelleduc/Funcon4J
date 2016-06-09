package funcons.values;

import funcons.values.properties.Comparable;

public interface Number extends Value, Comparable {
    java.lang.Integer intValue();
    java.lang.Boolean boolValue();
    java.lang.Double floatValue();
}
