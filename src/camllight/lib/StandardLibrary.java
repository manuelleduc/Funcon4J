package camllight.lib;

public interface StandardLibrary<E> {
    funcons.algebras.RecordAlg<E> alg();

    default E refFun() {
        return alg().abs(alg().alloc(alg().given()));
    }

    default E print_floatFun() {
        return alg().abs(alg().print(alg().given()));
    }

    default E print_stringFun() {
        return alg().abs(alg().print(alg().given()));
    }
}
