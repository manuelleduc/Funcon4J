package funcons.algebras.entities;

public interface SupplyGivenAlg<E> {
    E given();
    E supply(E exp, E x);
}
