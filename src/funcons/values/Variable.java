package funcons.values;

import funcons.entities.Store;
import funcons.values.properties.ExternalRascalValue;
import funcons.values.properties.Value;
import org.rascalmpl.value.IValue;

import java.lang.String;

public class Variable implements Value, ExternalRascalValue {
    private java.lang.Integer loc;
    private Store store;

    public Variable(java.lang.Integer location, Store store) {
        this.loc = location;
        this.store = store;
    }

    public Value value() {
        return store.val(this);
    }

    @Override
    public int hashCode() {
        return loc;
    }

    @Override
    public String toString() {
        return "Variable@" + loc + "<" + value() + ">";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variable && ((Variable)o).loc.equals(loc);
    }

    @Override
    public boolean isEqual(IValue other) {
        return equals(other);
    }
}
