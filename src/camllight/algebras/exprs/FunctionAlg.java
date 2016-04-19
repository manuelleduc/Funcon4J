package camllight.algebras.exprs;

import noa.syntax.Syntax;

public interface FunctionAlg<E> extends ExpControlAlg<E> {

    @Syntax("exp = function exp")
    default E funcAplication(E e1, E e2) {
        return alg().apply(e1, e2);
    }

    @Syntax("exp = function")
    default E functionExpr(E f) {
        return f;
    }

    @Syntax("function = 'function' pattmatch")
    default E function(E pm) {
        return alg().close(alg().preferOver(pm, alg().abs(alg().throw_(alg().matchFailure()))));
    }

    @Syntax("function = 'fun' pattmatch")
    default E func(E pm) {
        return function(pm);
    }

    //E match(E f, E e1);
}
