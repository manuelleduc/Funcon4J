package funcons.algebras.types;

public interface TypeAlg<E> {
    E type(java.lang.String name);
    E unknownType();
    E tag(java.lang.String name);
    E typeVar(java.lang.String name);
    E clVariant(java.lang.String tagName, E exp);
    E meta(java.lang.String name);
    E nomTag(E token);
    E nomVal(E nomTag, E val);
    E nomValSelect(E nomTag, E nomVal);
    E scopeNominalCoercion(E type1, E type2, E abs);
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
