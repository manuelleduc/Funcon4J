package camllight.algebras;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntAddAlg<E> {

    @Syntax("prog = exp")
    E start(E e);

    @Syntax("exp = NUM")
    E lit(Integer l);

    @Syntax("exp = exp '+' exp") @Level(10)
    E add(E l1, E l2);
}
