package funcons.values;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public abstract class Map<K, V> implements Value {
    private interface Scope<K, V> {
        V get(K key);
    }

    private final Scope<K, V> scope;

    public Map() {
        scope = (key) -> null;
    }

    public Map(K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : null;
    }

    public Map(Map<K, V> m, K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : m.val(otherKey);
    }

    public Map(Map<K, V> a, Map<K, V> b) {
        scope = (key) -> {
            V result = b.val(key);
            return result != null ? result : a.val(key);
        };
    }

    public abstract Map<K, V> add(K key, Value x);

    public abstract Map<K, V> extend(Map<K, V> m);

    public V val(K key) {
        return scope.get(key);
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
