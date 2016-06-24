package funcons.values;

import funcons.values.properties.RascalValue;
import funcons.values.properties.Unit;
import org.rascalmpl.value.IValue;

public class Null implements Unit, RascalValue {
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Null;
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public java.lang.String toString() {
        return "NULL";
    }
}
