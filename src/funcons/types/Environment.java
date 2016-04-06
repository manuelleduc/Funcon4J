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

    private Environment(Environment env, Variable name, Value x) {
        map = new HashMap<>(env.map);
        map.put(name, x);
    }

    private Environment(Environment a, Environment b) {
        map = new HashMap<>(b.map);
        map.putAll(a.map);
    }

    public Environment store(Variable name, Value x) {
        return new Environment(this, name, x);
    }

    public Environment extend(Environment env) {
        return new Environment(env, this);
    }

    public Value val(Variable name) {
        return map.get(name);
    }
}
