package funcons;

import funcons.types.Value;
import funcons.types.Variable;

import java.util.HashMap;

public class Store {
    private HashMap<Variable, Value> map;

    public Store() {
        map = new HashMap<>();
    }

    public void store(Variable name, Value val) {
        map.put(name, val);
    }

    public Value val(Variable name) {
        return map.get(name);
    }
}
