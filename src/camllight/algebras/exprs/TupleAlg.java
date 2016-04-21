package camllight.algebras.exprs;

import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TupleAlg<E> extends ExpControlAlg<E> {
    @Syntax("exp = '(' exp exptuple+ ')'") // Love your brackets.
    default E exprTupleMulti(E exp, List<E> exps) {
        E tuple = alg().tuple();

        ListIterator<E> it = exps.listIterator(exps.size());
        while (it.hasPrevious()) {
            tuple = alg().tuplePrefix(it.previous(), tuple);
        }

        return alg().tuplePrefix(exp, tuple);
    }

    @Syntax("exptuple = ',' exp")
    default E exprTupleSingle(E exp) {
        return exp;
    }
}
