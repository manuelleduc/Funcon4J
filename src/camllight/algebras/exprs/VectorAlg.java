package camllight.algebras.exprs;

import noa.syntax.Syntax;

import java.util.List;

public interface VectorAlg<E> extends ListAlg<E> {

    @Syntax("exp = EMPTYVECTORTOKEN")
    default E emptyVector(java.lang.String src) {
        return alg().vector();
    }

    @Syntax("exp = '[|' exp ']|'")
    default E vector(E exp) {
        return alg().vector(exp);
    }

    @Syntax("exp = '[|' exp vectorremainderexp+ '|]'")
    default E vectorMulti(E exp, List<E> exps) {
        E vector = alg().vector(exp);
        for (E otherExp : exps) {
            vector = alg().vectorAppend(vector, alg().vector(otherExp));
        }
        return vector;
    }

    @Syntax("vectorremainderexp = ';' exp")
    default E vectorRemainder(E exp) {
        return exp;
    }
}
