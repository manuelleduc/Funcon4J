package camllight.algebras.exprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface BaseExpAlg<E> extends StartAlg<E> {
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

    @Syntax("exp = exp ':' type")
    default E typedExp(E exp, E type) {
        return alg().typed(exp, type);
    }
}
