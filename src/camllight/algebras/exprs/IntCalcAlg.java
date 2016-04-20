package camllight.algebras.exprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> extends StartAlg<E> {

    @Syntax("exp = constant")
    default E constExp(E e) {
        return e;
    }

    @Syntax("exp = ident")
    default E idExp(E id) { // TODO should include instantiate-if-poly;
        return alg().boundValue(id);
    }

    @Syntax("exp = '(' exp ')'")
    default E bracketedExp(E e) {
        return e;
    }

    @Syntax("exp = 'begin' exp 'end'")
    default E beginEndExp(E e) {
        return e;
    }

    @Syntax("exp = exp '+' exp") @Level(110)
    default E intAdd(E l1, E l2) {
        return alg().intAdd(l1, l2);
    }

    @Syntax("exp = exp '*' exp") @Level(120)
    default E intMultiply(E a, E b) {
        return alg().intMultiply(a, b);
    }

    @Syntax("exp = exp '>' exp") @Level(80)
    default E intGreater(E e1, E e2) {
        return alg().intGreater(e1, e2);
    }

    @Syntax("exp = exp '<' exp") @Level(80)
    default E intSmaller(E e1, E e2) {
        return alg().intSmaller(e1, e2);
    }

    @Syntax("exp = exp '>=' exp") @Level(80)
    default E intGreaterEqual(E e1, E e2) {
        return alg().intGreaterEqual(e1, e2);
    }

    @Syntax("exp = exp '<=' exp") @Level(80)
    default E intSmallerEqual(E e1, E e2) {
        return alg().intSmallerEqual(e1, e2);
    }

    @Syntax("exp = exp '=' exp") @Level(80)
    default E intEqual(E e1, E e2) {
        return alg().equal(e1, e2);
    }
}
