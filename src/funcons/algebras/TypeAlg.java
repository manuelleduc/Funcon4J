package funcons.algebras;

public interface TypeAlg<E> extends ListAlg<E> {
    E type(java.lang.String name);
    E tag(java.lang.String name);
    E typeVar(java.lang.String name);
    E variant(java.lang.String tagName, E exp);
    E depends(E type1, E type2);
    E typed(E exp, E type);
    E boundType(E id);
    E freshToken();
    E newType(E name);
    E typeDef(E id, E type);
    E restrictDomain(E abs, E type);
    E pattAtType(E patt, E type);
    E variantMatch(E tag, E variant, E patt);
}
