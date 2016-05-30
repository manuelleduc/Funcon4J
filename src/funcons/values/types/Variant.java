package funcons.values.types;

import funcons.values.Value;

public class Variant implements Value {
    public final Tag tag;
    public final Value value;

    public Variant(java.lang.String name, Value v) {
        tag = new Tag(name);
        value = v;
    }

    public Variant(funcons.values.String name, Value v) {
        this(name.stringValue(), v);
    }

    public boolean sameTag(Variant other) {
        return other.tag.equals(this.tag);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variant && ((Variant)o).tag.equals(this.tag) && ((Variant)o).value.equals(this.value);
    }

    @Override
    public int hashCode() {
        return tag.hashCode() * 37 + value.hashCode();
    }

    @Override
    public String toString() {
        return "Variant(" + tag + "," + value + ")";
    }
}
