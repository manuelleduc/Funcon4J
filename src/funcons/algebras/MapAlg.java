package funcons.algebras;

public interface MapAlg<E> extends LogicWhileTrueAlg<E> {
    E id(java.lang.String s);
    E nameId(java.lang.String namespace, java.lang.String id);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);
    E given();
    E supply(E exp, E x);
    E environment();
    E mapUpdate(E map, E key, E e);
    E mapUnion(E map1, E map2);
    E mapOver(E map1, E map2);
    E fwdFresh();
}