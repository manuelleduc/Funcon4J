package funcons.algebras;

public interface TypeAlg<E> extends ListAlg<E> {
    E type(java.lang.String name);
    E typed(E exp, E type);
}
