package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface IntCalcAlg<E> extends ExpAlg<E> {
    @Syntax("exp = '-' exp") @Level(1515)
    default E intUnarySub(E exp) {
        return alg().intNegate(exp);
    }

    @Syntax("exp = exp '+' exp") @Level(1511)
    default E intAdd(E a, E b) {
        return alg().intAdd(a, b);
    }

    @Syntax("exp = exp '-' exp") @Level(1511)
    default E intSub(E a, E b) {
        return alg().intSubtract(a, b);
    }

    @Syntax("exp = exp '*' exp") @Level(1512)
    default E intMultiply(E a, E b) {
        return alg().intMultiply(a, b);
    }

    @Syntax("exp = exp '/' exp") @Level(1512)
    default E intDivide(E a, E b) {
        return alg().intDivide(a, b);
    }

    @Syntax("exp = exp 'mod' exp") @Level(1513)
    default E intMod(E a, E b) {
        return alg().intModulo(a, b);
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
