package funcons.values;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashSet;
import java.util.Set;

public class Map<K, V> implements Value {
    private interface Keys<K> {
        Set<K> get();
    }

    private interface Scope<K, V> {
        V get(K key);
    }

    private final Scope<K, V> scope;
    private final Keys<K> keys;

    public Map() {
        scope = (key) -> null;
        keys = HashSet::new;
    }

    public Map(K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : null;
        keys = () -> {
            Set<K> ks = new HashSet<>();
            ks.add(key);
            return ks;
        };
    }

    public Map(Map<K, V> m, K key, V x) {
        scope = (otherKey) -> key.equals(otherKey) ? x : m.val(otherKey);
        keys = () -> {
            Set<K> ks = m.keys();
            ks.add(key);
            return ks;
        };
    }

    public Map(Map<K, V> a, Map<K, V> b) {
        scope = (key) -> {
            V result = b.val(key);
            return result != null ? result : a.val(key);
        };
        keys = () -> {
            Set<K> ks = a.keys();
            ks.addAll(b.keys());
            return ks;
        };
    }

    public Map<K, V> add(K key, V x) {
        return new Map<>(this, key, x);
    }

    public Map<K, V> extend(Map<K, V> m) {
        return new Map<>(this, m);
    }

    public V val(K key) {
        return scope.get(key);
    }

    public Set<K> keys() {
        return keys.get();
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
