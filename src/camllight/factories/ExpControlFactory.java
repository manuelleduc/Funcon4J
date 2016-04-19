package camllight.factories;

public interface ExpControlFactory<E> extends BoolLogicFactory<E>, camllight.algebras.ExpControlAlg<E> {
    @Override
    default E id(java.lang.String name) {
        return alg().id(name);
    }

    @Override
    default E ifElse(E e1, E e2, E e3) {
        return alg().ifTrue(e1, e2, e3);
    }

    @Override
    default E whileTrue(E e, E c) {
        return alg().whileTrue(e, alg().effect(c));
    }

    @Override
    default E for_(E id, E start, E finish, E e3) {
        return alg().applyToEach(alg().abs(alg().bind(id), alg().effect(e3)), alg().intClosedInterval(start, finish));
    }

    @Override
    default E seq(E e1, E e2) {
        return alg().seq(alg().effect(e1), e2);
    }
}
