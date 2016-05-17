package funcons.algebras;

public interface PrintAlg<E> extends BoolAlg<E> {
    E print(E x);
}
