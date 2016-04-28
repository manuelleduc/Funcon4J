package funcons.algebras;

public interface TypeAlg<E> extends ListAlg<E> {
    E type(java.lang.String name);
    E tag(java.lang.String name);
    E variant(java.lang.String tagName, E exp);
    E typed(E exp, E type);
    E freshToken();
    E newType(E name);
    E restrictDomain(E abs, E type);
    E pattAtType(E patt, E type);
    E variantMatch(E tag, E variant, E patt);
}
