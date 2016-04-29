package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> extends BaseExpAlg<E> {
    @Syntax("exp = exp '+' exp") @Level(1511)
    default E intAdd(E l1, E l2) {
        return alg().intAdd(l1, l2);
    }

    @Syntax("exp = exp '*' exp") @Level(1512)
    default E intMultiply(E a, E b) {
        return alg().intMultiply(a, b);
    }

    @Syntax("exp = exp '>' exp") @Level(1508)
    default E intGreater(E e1, E e2) {
        return alg().intGreater(e1, e2);
    }

    @Syntax("exp = exp '<' exp") @Level(1508)
    default E intSmaller(E e1, E e2) {
        return alg().intSmaller(e1, e2);
    }

    @Syntax("exp = exp '>=' exp") @Level(1508)
    default E intGreaterEqual(E e1, E e2) {
        return alg().intGreaterEqual(e1, e2);
    }

    @Syntax("exp = exp '<=' exp") @Level(1508)
    default E intSmallerEqual(E e1, E e2) {
        return alg().intSmallerEqual(e1, e2);
    }

    @Syntax("exp = exp '=' exp") @Level(1508)
    default E intEqual(E e1, E e2) {
        return alg().equal(e1, e2);
    }
}
