package camllight.algebras.patts;

import noa.syntax.Syntax;

public interface TuplePattAlg<E> extends PattAlg<E> {
    @Syntax("patt = patt ',' patttuple")
    default E commaSeperatedPatt(E p, E pt) {
        return tuplePatt(p, pt);
    }

    @Syntax("patttuple = patt")
    default E unaryTuplePatt(E p) { // TODO should include invert?
        return alg().tuplePrefix(p, alg().only(alg().tuple()));
    }

    @Syntax("patttuple = patt ',' patttuple")
    default E tuplePatt(E p, E remainder) { // TODO should include invert?
        return alg().tuplePrefix(p, remainder);
    }
}
