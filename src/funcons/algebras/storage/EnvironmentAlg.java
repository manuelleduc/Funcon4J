package funcons.algebras.storage;

public interface EnvironmentAlg<E> {
    E id(java.lang.String s);
    E nameId(java.lang.String namespace, java.lang.String id);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);

    E environment();
    E environment(E id, E val);
    E accum(E env, E decl);
}
