package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BoolLogicAlg<E> extends IntCalcAlg<E> {
    @Syntax("exp = exp ('&' | '&&') exp") @Level(60)
    default E lAnd(E e1, E e2) {
        return alg().ifTrue(e1, e2, alg().bool(false));
    }

    @Syntax("exp = exp ('||' | 'or') exp") @Level(50)
    default E lOr(E e1, E e2) {
        alg().bool(false);
        return alg().ifTrue(e1, alg().bool(true), e2);
    }

    @Syntax("exp = 'not' exp") @Level(70)
    default E lNot(E e1) {
        return alg().not(e1);
    }
}
