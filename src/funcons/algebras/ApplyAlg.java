package funcons.algebras;

public interface ApplyAlg<E> extends BindAlg<E> {
    E apply(E abs, E arg);
}
