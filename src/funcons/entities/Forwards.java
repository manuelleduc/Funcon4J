package funcons.entities;

import funcons.values.Map;
import funcons.values.Value;
import funcons.values.recursion.Fwd;

public class Forwards {

    private Map<Fwd, Value> map;
    private Integer n;

    public Forwards() {
        map = new Map<>();
        n = 0;
    }

    public Fwd freshFwd() {
        return new Fwd(n);
    }

    public void add(Fwd key, Value x) {
        map = map.add(key, x);
        n++;
    }

    public Value follow(Fwd f) {
        return map.val(f);
    }
}
