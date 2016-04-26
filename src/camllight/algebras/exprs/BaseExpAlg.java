package camllight.algebras.exprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BaseExpAlg<E> extends StartAlg<E> {
    @Syntax("exp = constant") @Level(2700)
    default E constExp(E e) {
        return e;
    }

    @Syntax("exp = ident") @Level(2900)
    default E idExp(E id) { // TODO should include instantiate-if-poly;
        return alg().boundValue(id);
    }

    @Syntax("exp = '(' exp ')'") @Level(2600)
    default E bracketedExp(E e) {
        return e;
    }

    @Syntax("exp = 'begin' exp 'end'") @Level(2500)
    default E beginEndExp(E e) {
        return e;
    }

    @Syntax("exp = '(' exp ':' type ')'") @Level(2400)
    default E typedExp(E exp, E type) {
        return alg().typed(exp, type);
    }
}
