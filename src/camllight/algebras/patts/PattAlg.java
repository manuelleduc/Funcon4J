package camllight.algebras.patts;

import camllight.algebras.base.ModuleAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface PattAlg<E> extends ModuleAlg<E> {

    @Syntax("patt = '(' patt ')'")
    default E bracketedPatt(E patt) {
        return patt;
    }

    @Syntax("patt = ident")
    default E pattId(E id) {
        return alg().bind(id);
    }

    @Syntax("patt = '(' patt ':' type ')'")
    default E pattType(E patt, E type) {
        return alg().pattAtType(patt, type);
    }

    @Syntax("patt = patt 'as' ident")
    default E pattAs(E patt, E id) {
        return alg().pattUnion(patt, alg().bind(id));
    }

    @Syntax("patt = WILDCARDTOKEN")
    default E pattWildcard(String wildcard) {
        return alg().any();
    }

    @Syntax("patt = constant")
    default E pattConstant(E constant) {
        return alg().only(constant);
    }

    @Syntax("patt = CONSTRTOKEN") @Level(0)
    default E pattConstr(java.lang.String constrToken) {
        return alg().abs(alg().variantMatch(
                alg().tag(constrToken),
                alg().apply(alg().instantiateIfPoly(alg().boundValue(alg().nameId("variant_selector", constrToken))), alg().given()),
                alg().only(alg().tuple())
        ));
    }

    @Syntax("patt = CONSTRTOKEN patt") @Level(1)
    default E pattConstrPatt(java.lang.String constrToken, E patt) {
        return alg().abs(alg().variantMatch(
                alg().tag(constrToken),
                alg().apply(alg().instantiateIfPoly(alg().boundValue(alg().nameId("variant_selector", constrToken))), alg().given()),
                patt
        ));
    }

    @Syntax("patt = <assoc=right> patt '|' patt")
    default E optionalPatt(E p1, E p2) {
        return alg().pattNonBinding(alg().preferOver(p1, p2));
    }
}
