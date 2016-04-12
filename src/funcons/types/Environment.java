package funcons.types;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Environment implements Value {

    private interface Scope {
        Value get(Id name);
    }

    private final Scope scope;

    public Environment(){
        scope = (name) -> null;
    }

    public Environment(Id name, Value x) {
        scope = (n) -> name.equals(n) ? x : null;
    }

    private Environment(Environment env, Id name, Value x) {
        scope = (n) -> name.equals(n) ? x : env.val(name);
    }

    private Environment(Environment a, Environment b) {
        scope = (name) -> {
            Value result = b.val(name);
            return result != null ? result : a.val(name);
        };
    }

    public Environment store(Id name, Value x) {
        return new Environment(this, name, x);
    }

    public Environment extend(Environment env) {
        return new Environment(this, env);
    }

    public Value val(Id name) {
        return scope.get(name);
    }

    @Override
    public int hashCode() {
        throw new NotImplementedException();
    }

    @Override
    public boolean equals(Object other) {
        throw new NotImplementedException();
    }

}
