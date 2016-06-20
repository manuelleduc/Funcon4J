package funcons.algebras.functions;

public interface CurryAlg<E> {
    E partialApp(E f, E x);
    E partialAppN(E f, E x);
    E curry(E f);
    E curryN(E n, E f);
    E uncurry(E abs);
}
