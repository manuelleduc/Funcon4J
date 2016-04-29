package funcons.algebras;

public interface ModuleAlg<E> extends TypeAlg<E> {
    E accum(E env, E decl);
}
