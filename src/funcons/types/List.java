package funcons.types;

public class List implements Value {
    private List tail;
    private Value head;

    public List() {
        tail = null;
        head = null;
    }

    public List(Value v) {
        tail = new List();
        head = v;
    }

    public List(Value v1, Value v2) {
        tail = new List(v2);
        head = v1;
    }

    private List(Value v, List l) {
        tail = l;
        head = v;
    }


    public List prepend(Value v) {
        return new List(v, this);
    }

    public List append(Value v) {
        return append(new List(v));
    }

    public List append(List l) {
        if (head() == null) {
            return l;
        }

        List newL = l.prepend(head());
        return tail() == null ? newL : tail().append(newL);
    }

    public Value get(Int i) {
        if (i.intValue() == 0) {
            return head;
        }
        return tail.get(new Int(i.intValue() - 1));
    }

    public Value head() {
        return head;
    }

    public List tail() {
        return tail;
    }
}
