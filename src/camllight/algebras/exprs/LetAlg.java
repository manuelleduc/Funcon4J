package camllight.algebras.exprs;

import funcons.algebras.storage.BindAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface LetAlg<E, A extends BindAlg<E>> {
    A alg();

    @Syntax("exp = letExp") @Level(1)
    default E letExp(E letExp) {
        return letExp;
    }

    @Syntax("letExp = decl 'in' exp")
    default E letInExp(E decl, E exp) {
        return alg().scope(decl, exp);
    }
}
