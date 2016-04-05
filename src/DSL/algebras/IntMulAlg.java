package DSL.algebras;

public interface IntMulAlg<E> extends IntAddAlg<E> {
    E multiply(E a, E b);
}
