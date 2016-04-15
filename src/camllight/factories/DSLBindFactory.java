package camllight.factories;

import camllight.algebras.DSLBindAlg;
import funcons.algebras.BindAlg;

public interface DSLBindFactory<E> extends ExpControlFactory<E>, DSLBindAlg<E> {

    BindAlg<E> bindAlg();

    @Override
    default E var(java.lang.String s) {
        return bindAlg().id(s);
    }

    @Override
    default E bindValue(E var, E exp) {
        return bindAlg().bindValue(var, exp);
    }

    @Override
    default E boundValue(E var) {
        return bindAlg().boundValue(var);
    }

    @Override
    default E scope(E env, E exp) {
        return bindAlg().scope(env, exp);
    }
}
