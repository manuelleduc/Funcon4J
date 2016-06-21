package funcons.algebras.collections;

public interface RecordAlg<E> {
    E record(E field, E val);
    E field(java.lang.String name);
    E recordSelect(E record, E field);
    E recordOver(E rec1, E rec2);
    E recordUnion(E rec1, E rec2);
    E recordMatch(E rec, E pattMap);
}
