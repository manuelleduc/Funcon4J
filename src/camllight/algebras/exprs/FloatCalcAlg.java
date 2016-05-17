package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface FloatCalcAlg<E> extends IntCalcAlg<E> {

    @Syntax("exp = '-.' exp") @Level(1516)
    default E floatNegateExp(E exp) {
        return alg().floatNegate(exp);
    }

    @Syntax("exp = exp '+.' exp") @Level(1511)
    default E floatAddExp(E exp1, E exp2) {
        return alg().floatAdd(exp1, exp2);
    }

    @Syntax("exp = exp '-.' exp") @Level(1511)
    default E floatSubtractExp(E exp1, E exp2) {
        return alg().floatSubtract(exp1, exp2);
    }

    @Syntax("exp = exp '*.' exp") @Level(1512)
    default E floatMultiplyExp(E exp1, E exp2) {
        return alg().floatMultiply(exp1, exp2);
    }

    @Syntax("exp = exp '/.' exp") @Level(1512)
    default E floatDivideExp(E exp1, E exp2) {
        return alg().floatDivide(exp1, exp2);
    }
}
