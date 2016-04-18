package camllight.algebras;

import funcons.algebras.ListAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> {
    ListAlg<E> alg();

    @Syntax("prog = exp")
    E start(E e);

    @Syntax("exp = '(' exp ')'")
    default E bracketedExp(E e) { return e; }

    @Syntax("exp = 'begin' exp 'end'")
    default E beginEndExp(E e) { return e; }

    @Syntax("exp = NUM")
    E lit(Integer l);

    @Syntax("exp = exp '+' exp") @Level(110)
    E add(E l1, E l2);

    @Syntax("exp = exp '*' exp") @Level(120)
    E multiply(E a, E b);
}
