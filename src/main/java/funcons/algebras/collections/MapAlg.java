package funcons.algebras.collections;

public interface MapAlg<E> {
    E map(E key, E val);
    E mapUpdate(E map, E key, E val);
    E mapDomain(E map);
    E mapUnion(E map1, E map2);
    E mapOver(E map1, E map2);
    E mapGet(E map, E key);
}