package funcons.types;

import java.util.HashMap;
import java.util.Map;

public class Environment implements Value {
    private final Map<Variable, Value> map;

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
        map = new HashMap<>(a.map);
        map.putAll(b.map);
    }

    public Environment store(Variable name, Value x) {
        return new Environment(this, name, x);
    }

    public Environment extend(Environment env) {
        return new Environment(this, env);
    }

    public Value val(Variable name) {
        return map.get(name);
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Environment && ((Environment) other).map.equals(map);
    }

}
