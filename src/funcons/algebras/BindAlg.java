package funcons.algebras;

public interface BindAlg<E> extends LogicWhileTrueAlg<E> {
    E id(java.lang.String s);
    E nameId(java.lang.String namespace, java.lang.String id);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);
    E given();
    E supply(E exp, E x);
    E environmentUnion(E env1, E env2);
}