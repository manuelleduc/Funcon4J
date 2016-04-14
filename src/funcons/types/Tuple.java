package funcons.types;

public class Tuple implements Value {
    private final Tuple tail;
    private final Value head;

    public Tuple() {
        tail = null;
        head = null;
    }

    public Tuple(Value a) {
        tail = new Tuple();
        head = a;
    }

    public Tuple(Value a, Value b) {
        tail = new Tuple(b);
        head = a;
    }

    public Tuple(Value a, Value b, Value c) {
        tail = new Tuple(b, c);
        head = a;
    }

    private Tuple(Tuple t, Value v) {
        tail = t;
        head = v;
    }

    public Tuple prepend(Value v) {
        return new Tuple(this, v);
    }

    public Value get(Int i) {
        if (i.intValue() == 0) {
            return head;
        }
        return tail == null ? null : tail.get(new Int(i.intValue() - 1));
    }

    public Int size() {
        if (tail == null) {
            return new Int(head == null ? 0 : 1);
        }
        return new Int(1 + tail.size().intValue());
    }

    public Value head() {
        return head;
    }

    public Tuple tail() {
        return tail;
    }

    @Override
    public int hashCode() {
        return (head == null ? 0 : head.hashCode()) + (tail == null ? 0 : 10 * tail.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tuple)) {
            return false;
        }

        Tuple other = (Tuple)o;

        return (head == null ? other.head == null : head.equals(other.head)) &&
                (tail == null ? other.tail == null : tail.equals(other.tail));
    }
}
