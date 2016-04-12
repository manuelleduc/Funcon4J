package funcons.types;

public class Tuple implements Value {
    private final Tuple prev;
    private final Value val;

    public Tuple() {
        prev = null;
        val = null;
    }

    public Tuple(Value a) {
        prev = new Tuple();
        val = a;
    }

    public Tuple(Value a, Value b) {
        prev = new Tuple(b);
        val = a;
    }

    public Tuple(Value a, Value b, Value c) {
        prev = new Tuple(b, c);
        val = a;
    }

    public Value get(Int i) {
        if (i.intValue() == 0) {
            return val;
        }
        return prev == null ? null : prev.get(new Int(i.intValue() - 1));
    }

    public Int size() {
        if (prev == null) {
            return new Int(val == null ? 0 : 1);
        }
        return new Int(1 + prev.size().intValue());
    }

    @Override
    public int hashCode() {
        return (val == null ? 0 : val.hashCode()) + (prev == null ? 0 : 10 * prev.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tuple)) {
            return false;
        }

        Tuple other = (Tuple)o;

        return (val == null ? other.val == null : val.equals(other.val)) &&
                (prev == null ? other.prev == null : prev.equals(other.prev));
    }
}
