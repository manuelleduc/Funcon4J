package DSL;

import DSL.algebras.DSLBindAlg;
import funcons.algebras.BindAlg;

public interface DSLBindFactory<E> extends ExpControlFactory<E>, DSLBindAlg<E> {

    BindAlg<E> bindAlg();

    @Override
    default E var(java.lang.String s) {
        return bindAlg().var(s);
    }

    @Override
    default E bindValue(E var, E exp) {
        return bindAlg().bindValue(var, exp);
    }

    @Override
    default E boundValue(E var) {
        return bindAlg().boundValue(var);
    }
}
