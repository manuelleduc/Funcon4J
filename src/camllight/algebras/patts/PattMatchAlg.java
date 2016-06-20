package camllight.algebras.patts;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.TupleAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface PattMatchAlg
        <E, A extends
                TupleAlg<E> &
                PatternAlg<E> &
                FunctionAlg<E> &
                ExceptionAlg<E> &
                CurryAlg<E> &
                IntAlg<E>>
        extends TuplePattAlg<E, A> {
    @Syntax("pattmatch = pattmatchsingle") @Level(0)
    default E pattMatch(E pm) {
        return pm;
    }

    @Syntax("pattmatchsingle = patt '->' exp")
    default E pattMatchSingle(E p, E e) {
        return alg().abs(p, e);
    }

    @Syntax("pattmatch = pattmatchsingle '|' pattmatch") @Level(1)
    default E pattMatchMulti(E head, E tail) {
        return alg().preferOver(head, tail);
    }

    @Syntax("pattmatch = '|' pattmatch")
    default E pattMatchStripe(E pm) {
        return pm;
    }

    @Syntax("pattmatchcurried = patt+ '->' exp")
    default E pattMatchCurriedMulti(java.util.List<E> ps, E exp) {
        E pattern = pattTuple(ps.get(0), ps.subList(1, ps.size()));
        return alg().curryN(alg().lit(ps.size()), pattMatchSingle(pattern, exp));
    }
}