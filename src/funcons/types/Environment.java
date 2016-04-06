package funcons.types;

import java.util.HashMap;
import java.util.Map;

public class Environment implements Value {
    private Map<Variable, Value> map;

    public Environment(){
        map = new HashMap<>();
    }

    public Environment(Variable name, Value x) {
        this();
        map.put(name, x);
    }

    private Environment(Environment e, Variable name, Value x) {
        map = new HashMap<>(e.map);
        map.put(name, x);
    }

    public Environment store(Variable name, Value x) {
        return new Environment(this, name, x);
    }

    public Value val(Variable name) {
        return map.get(name);
    }
}
