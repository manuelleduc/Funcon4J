package funcons.values;

public class Vector implements Value {
    private final List list;

    public Vector() {
        list = new List();
    }

    public Vector(Value v) {
        list = new List(v);
    }

    public Vector(List l) {
        list = l;
    }

    public Vector append(Vector other) {
        return new Vector(list.append(other.list));
    }

    public Value get(Int i) {
        return list.get(i);
    }

    public Int length() {
        return list.length();
    }

    @Override
    public int hashCode() {
        return list.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Vector && ((Vector)other).list.equals(this.list);
    }
}
