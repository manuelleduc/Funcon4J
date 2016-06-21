package funcons.algebras.collections;

public interface VectorAlg<E> {
    E vector();
    E vector(E val);
    E vectorSelect(E vector, E index);
    E vectorAppend(E vector1, E vector2);
    E vectorLength(E vector);
    E vectorAssign(E vector, E index, E val);
}
