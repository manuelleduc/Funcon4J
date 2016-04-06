package funcons.types;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Environment {
    private Map<String, Value> map;

    public Environment(){
        map = new HashMap<>();
    }

    private Environment(Environment e, String name, Value x) {
        this.map = new HashMap<>(e.map);
        this.map.put(name, x);
    }

    public Environment store(String name, Value x) {
        return new Environment(this, name, x);
    }

    public Value val(String name) {
        return map.get(name);
    }
}
