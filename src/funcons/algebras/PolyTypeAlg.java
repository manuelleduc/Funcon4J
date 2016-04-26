package funcons.algebras;

public interface PolyTypeAlg<E> extends TypeAlg<E> {
    E instantiatePoly(E x);
    E instantiateIfPoly(E x);
}
