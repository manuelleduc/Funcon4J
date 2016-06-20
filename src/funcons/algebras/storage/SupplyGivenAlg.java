package funcons.algebras.storage;

public interface SupplyGivenAlg<E> {
    E given();
    E supply(E exp, E x);
}
