package camllight.algebras.patts;

import noa.syntax.Syntax;

import java.util.Collection;

public interface PattMatchAlg<E> extends ListPattAlg<E> {

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

    @Syntax("pattmatchcurried = patt+ '->' exp")
    default E pattMatchCurriedMulti(java.util.List<E> ps, E exp) {
        E pattern = this.pattTuple(ps.get(0), ps.subList(1, ps.size()));
        return alg().curryN(alg().lit(ps.size()), pattMatchSingle(pattern, exp));
    }
}