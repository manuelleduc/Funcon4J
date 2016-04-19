package camllight.algebras;

import funcons.algebras.ListAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> {
    ListAlg<E> alg();

    @Syntax("prog = exp")
    E start(E e);

    // Not part of the language, just used for easy testing purposes
    @Syntax("exp = 'print' exp")
    default E print(E e) {
        return alg().print(e);
    }

    @Syntax("exp = '(' exp ')'")
    default E bracketedExp(E e) { return e; }

    @Syntax("exp = 'begin' exp 'end'")
    default E beginEndExp(E e) { return e; }

    @Syntax("exp = NUM")
    E lit(Integer l);

    @Syntax("exp = exp '+' exp") @Level(110)
    E intAdd(E l1, E l2);

    @Syntax("exp = exp '*' exp") @Level(120)
    E intMultiply(E a, E b);

    @Syntax("exp = exp '>' exp") @Level(80)
    E intGreater(E e1, E e2);

    @Syntax("exp = exp '<' exp") @Level(80)
    E intSmaller(E e1, E e2);

    @Syntax("exp = exp '>=' exp") @Level(80)
    E intGreaterEqual(E e1, E e2);

    @Syntax("exp = exp '<=' exp") @Level(80)
    E intSmallerEqual(E e1, E e2);

    @Syntax("exp = exp '=' exp") @Level(80)
    E intEqual(E e1, E e2);
}
