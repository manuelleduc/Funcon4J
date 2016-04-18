package camllight.factories;

public interface ExpControlFactory<E> extends BoolLogicFactory<E>, camllight.algebras.ExpControlAlg<E> {
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
        return null; // TODO
        //return alg().applyToEach(alg().bind(id), alg().intClosedInterval(start, finish));
        // alg().applyToEach(alg().abs(alg().bind(id), alg().effect(e3)), alg().intClosedInterval(start, finish));
    }
}


/*
expr[[for LI = E1 to E2 do E3 done]] = (71)
        apply-to-each(
            abs(
                bind(id [[LI]])
                , effect(expr[[E3]])),
            int-closed-interval(expr[[E1]], expr[[E2]])) */
