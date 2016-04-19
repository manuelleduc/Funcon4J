package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BoolLogicAlg<E> extends IntCalcAlg<E> {
    @Syntax("exp = BOOL")
    default E bool(java.lang.Boolean b) {
        return alg().bool(b);
    }

    @Syntax("exp = exp ('&' | '&&') exp") @Level(60)
    default E lAnd(E e1, E e2) {
        return alg().ifTrue(e1, e2, bool(false));
    }

    @Syntax("exp = exp ('||' | 'or') exp") @Level(50)
    default E lOr(E e1, E e2) {
        return alg().ifTrue(e1, bool(true), e2);
    }
}
