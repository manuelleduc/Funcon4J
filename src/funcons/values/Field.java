package funcons.values;

import funcons.values.properties.RascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

import java.lang.String;

public class Field implements Value, RascalValue {
    private java.lang.String name;

    public Field(java.lang.String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Field && ((Field)obj).name.equals(name);
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }

    @Override
    public String toString() {
        return name;
    }
}
