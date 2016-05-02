package funcons.values.recursion;

import funcons.values.Map;
import funcons.values.Value;

public class Forwards extends Map<Fwd, Value> {

    private final Integer n;

    public Forwards() {
        super();
        n = 0;
    }

    public Forwards(Fwd key, Value x) {
        super(key, x);
        n = 1;
    }

    private Forwards(Forwards m, Fwd key, Value x) {
        super(m, key, x);
        n = m.n + 1;
    }

    private Forwards(Forwards a, Forwards b) {
        super(a, b);
        n = a.n + b.n;
    }

    public Fwd freshFwd() {
        return new Fwd(n + 1);
    }

    @Override
    public Forwards add(Fwd key, Value x) {
        return new Forwards(this, key, x);
    }

    @Override
    public Forwards extend(Map<Fwd, Value> m) {
        return new Forwards(this, (Forwards)m);
    }
}
