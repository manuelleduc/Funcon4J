package camllight.algebras.decls;

import camllight.algebras.base.StartAlg;

public interface DSLBindAlg<E> extends StartAlg<E> {
    default E bindValue(E var, E exp) {
        return alg().bindValue(var, exp);
    }

    default E boundValue(E var) {
        return alg().boundValue(var);
    }

    default E scope(E env, E exp) {
        return alg().scope(env, exp);
    }
}
