package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface FunctionAlg<E> extends ListAlg<E> {
    @Syntax("exp = function") @Level(200)
    default E functionExpr(E f) {
        return f;
    }

    @Syntax("function = ident")
    default E functionId(E id) {
        return alg().boundValue(id);
    }

    @Syntax("function = function exp")
    default E funcAplication(E e1, E e2) {
        return alg().apply(e1, e2);
    }

    @Syntax("function = '(' function ')'")
    default E bracketedFunction(E f) {
        return f;
    }

    @Syntax("function = 'begin' function 'end'")
    default E beginEndFunction(E f) {
        return f;
    }

    @Syntax("function = 'function' pattmatch")
    default E function(E pm) {
        return alg().close(alg().preferOver(pm, alg().abs(alg().throw_(alg().matchFailure()))));
    }

    @Syntax("function = 'fun' pattmatchsingle") @Level(1)
    default E func(E pm) {
        return function(pm);
    }

    @Syntax("function = 'fun' pattmatchcurried") @Level(0)
    default E curriedFunc (E pm) {
        return function(pm);
    }
}
