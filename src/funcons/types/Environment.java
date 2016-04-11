package funcons.types;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Environment implements Value {

    private interface Scope {
        Value get(Variable name);
    }

    private final Scope scope;

    public Environment(){
        scope = (name) -> null;
    }

    public Environment(Variable name, Value x) {
        scope = (n) -> name.equals(n) ? x : null;
    }

    private Environment(Environment env, Variable name, Value x) {
        scope = (n) -> name.equals(n) ? x : env.val(name);
    }

    private Environment(Environment a, Environment b) {
        scope = (name) -> {
            Value result = b.val(name);
            return result != null ? result : a.val(name);
        };
    }

    public Environment store(Variable name, Value x) {
        return new Environment(this, name, x);
    }

    public Environment extend(Environment env) {
        return new Environment(this, env);
    }

    public Value val(Variable name) {
        return scope.get(name);
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }

    @Override
    public boolean equals(Object other) {
        throw new NotImplementedException();
        //return other instanceof Environment && ((Environment) other).map.equals(map);
    }

}
