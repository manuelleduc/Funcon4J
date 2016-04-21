package camllight.algebras.exprs;

import noa.syntax.Syntax;

public interface ExpLetAlg<E> extends FunctionAlg<E> {

    @Syntax("exp = decl 'in' exp")
    default E letIn(E decl, E exp) {
        return alg().scope(decl, exp);
    }
}
