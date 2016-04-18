package camllight.algebras;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BoolLogicAlg<E> extends IntCalcAlg<E> {
    @Syntax("exp = BOOL")
    E bool(java.lang.Boolean b);

    @Syntax("exp = exp ('&' | '&&') exp") @Level(60)
    E lAnd(E e1, E e2);

    @Syntax("exp = exp ('||' | 'or') exp") @Level(50)
    E lOr(E e1, E e2);
}
