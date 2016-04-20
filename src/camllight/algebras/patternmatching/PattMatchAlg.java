package camllight.algebras.patternmatching;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

import java.util.Collection;

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

    @Syntax("pattmatchcurried = patt+ '->' exp")
    default E pattMatchCurriedMulti(Collection<E> ps, E exp) {
        Integer i = 0;
        E pattern = alg().any();
        for (E patt : ps) {
            pattern = alg().pattUnion(
                    pattern,
                    alg().abs(alg().match(alg().project(alg().lit(i), alg().given()), patt))
            );
            i++;
        }

        return alg().curryN(alg().lit(ps.size()), pattMatchSingle(pattern, exp));
    }
}