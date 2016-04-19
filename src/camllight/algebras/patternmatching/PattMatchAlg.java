package camllight.algebras.patternmatching;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface PattMatchAlg<E> extends StartAlg<E> {

    @Syntax("pattmatch = pattmatchsingle")
    default E pattMatch1(E pm) {
        return pm;
    }

    @Syntax("pattmatch = pattmatchmultiple")
    default E pattMatch2(E pm) {
        return pm;
    }

    @Syntax("pattmatch = '|' pattmatch")
    default E pattMatchStripe(E pm) {
        return pm;
    }

    @Syntax("pattmatchsingle = patt '->' exp")
    default E pattMatchSingle(E p, E e) {
        return alg().abs(p, e);
    }

    @Syntax("pattmatchmultiple = pattmatchsingle '|' pattmatch")
    default E pattMatchMulti(E head, E tail) {
        return alg().preferOver(head, tail);
    }
}

/*
abs[[P1 -> E1]] = (83)
abs(patt[[P1]], expr[[E1]])

abs[[P1 -> E1 | P2 -> E2...]] = (84)
prefer-over(abs[[P1 -> E1]], abs[[P2 -> E2...]])

abs[[| P1 -> E1...]] = (85)
abs[[P1 -> E1...]
 */