package DSL.algebras;

public interface IntAddAlg<E> {
    E lit(Integer l);

    E add(E l1, E l2);
}
