package funcons.algebras.entities;

public interface BindingAlg<E> {
    E id(java.lang.String s);
    E nameId(java.lang.String namespace, java.lang.String id);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);
    E closure(E x, E environment);

    E environment();
    E accum(E env, E decl);
}
