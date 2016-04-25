package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ExpLetAlg<E> extends FunctionAlg<E> {

    @Syntax("exp = letExp")
    default E letExp(E letExp) {
        return letExp;
    }

    @Syntax("letExp = decl 'in' exp") @Level(1)
    default E letInExp(E decl, E exp) {
        return alg().scope(decl, exp);
    }
}
