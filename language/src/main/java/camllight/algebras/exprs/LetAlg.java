package camllight.algebras.exprs;

import funcons.algebras.entities.BindingAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface LetAlg<E, A extends BindingAlg<E>> {
    A alg();

    @Syntax("ident = IDTOKEN") @Level(0)
    default E id(java.lang.String name) {
        return alg().id(name);
    }

    @Syntax("exp = letExp") @Level(1)
    default E letExp(E letExp) {
        return letExp;
    }

    @Syntax("letExp = decl 'in' exp")
    default E letInExp(E decl, E exp) {
        return alg().scope(decl, exp);
    }
}
