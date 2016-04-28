package funcons.values;

public class Variable implements Value {
    private java.lang.Integer loc;

    public Variable(java.lang.Integer location) {
        this.loc = location;
    }

    @Override
    public int hashCode() {
        return loc;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Variable && ((Variable)o).loc.equals(loc);
    }
}
