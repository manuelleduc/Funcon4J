package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface StringAlg<E, A extends funcons.algebras.values.StringAlg<E>> {
    A alg();

    @Syntax("exp = exp '^' exp") @Level(1509)
    default E stringAppendExp(E str1, E str2) {
        return alg().stringAppend(str1, str2);
    }
}
