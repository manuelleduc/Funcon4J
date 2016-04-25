package funcons.types;

public class Tag implements Value {
    public final java.lang.String name;

    public Tag(java.lang.String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Tag && ((Tag)o).name.equals(this.name);
    }
}
