package camllight.algebras.patts;

import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TuplePattAlg<E> extends PattAlg<E> {
    @Syntax("patt = '(' patt patttuple+ ')'") // Love your brackets.
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
/*
    //@Syntax("patt = patt ',' patttuple")
    default E commaSeperatedPatt(E p, E pt) {
        return tuplePatt(p, pt);
    }

    //@Syntax("patttuple = patt")
    default E unaryTuplePatt(E p) { // TODO should include invert?
        return alg().tuplePrefix(p, alg().only(alg().tuple()));
    }

    //@Syntax("patttuple = patt ',' patttuple")
    default E tuplePatt(E p, E remainder) { // TODO should include invert?
        return alg().tuplePrefix(p, remainder);
    }*/
}
