package camllight.algebras.patts;

import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.TupleAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TuplePattAlg<E, A extends TupleAlg<E> & PatternAlg<E>> {
    A alg();

    @Syntax("patt = '(' patt patttuple+ ')'") @Level(50)
    default E pattTuple(E patt, List<E> patts) {

        ListIterator<E> it = patts.listIterator(patts.size());
        E tuple = alg().tuplePrefixPatt(it.previous(), alg().only(alg().tuple()));
        while (it.hasPrevious()) {
            tuple = alg().tuplePrefixPatt(it.previous(), tuple);
        }

        return alg().tuplePrefixPatt(patt, tuple);
    }

    @Syntax("patttuple = ',' patt")
    default E pattTupleSingle(E patt) {
        return patt;
    }
}
