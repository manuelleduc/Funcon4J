package funcons.values.recursion;

import funcons.values.Map;
import funcons.values.Value;

public class Forwards extends Map<Fwd, Value> {

    public Forwards() {
        super();
    }

    public Forwards(Fwd key, Value x) {
        super(key, x);
    }

    private Forwards(Forwards m, Fwd key, Value x) {
        super(m, key, x);
    }

    private Forwards(Forwards a, Map<Fwd, Value> b) {
        super(a, b);
    }

    @Override
    public Forwards add(Fwd key, Value x) {
        return new Forwards(this, key, x);
    }

    @Override
    public Forwards extend(Map<Fwd, Value> m) {
        return new Forwards(this, m);
    }
}
