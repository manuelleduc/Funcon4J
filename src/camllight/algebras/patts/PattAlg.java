package camllight.algebras.patts;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.types.TypeAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface PattAlg
        <E, A extends
                PolyTypeAlg<E> &
                TypeAlg<E> &
                PatternAlg<E> &
                SupplyGivenAlg<E> &
                EnvironmentAlg<E> &
                FunctionAlg<E> &
                ExceptionAlg<E>> {
    A alg();

    @Syntax("patt = '(' patt ')'") @Level(100)
    default E bracketedPatt(E patt) {
        return patt;
    }

    @Syntax("patt = ident") @Level(130)
    default E pattId(E id) {
        return alg().bind(id);
    }

    @Syntax("patt = '(' patt ':' type ')'") @Level(90)
    default E pattType(E patt, E type) {
        return alg().pattAtType(patt, type);
    }

    @Syntax("patt = patt 'as' ident") @Level(110)
    default E pattAs(E patt, E id) {
        return alg().pattUnion(patt, alg().bind(id));
    }

    @Syntax("patt = WILDCARDTOKEN") @Level(120)
    default E pattWildcard(String wildcard) {
        return alg().any();
    }

    @Syntax("patt = constant") @Level(70)
    default E pattConstant(E constant) {
        return alg().only(constant);
    }

    @Syntax("patt = CONSTRTOKEN") @Level(60)
    default E pattConstr(java.lang.String constrToken) {
        return alg().only(alg().boundValue(alg().id(constrToken)));
        /*return alg().abs(alg().variantMatch(
                alg().tag(constrToken),
                alg().apply(alg().instantiateIfPoly(alg().boundValue(alg().nameId("variant_selector", constrToken))), alg().given()),
                alg().only(alg().tuple())
        ));*/
    }

    @Syntax("patt = CONSTRTOKEN patt") @Level(61)
    default E pattConstrPatt(java.lang.String constrToken, E patt) {
        return alg().abs(alg().variantMatch(
                alg().tag(constrToken),
                alg().given(),
                patt));
                //alg().apply(alg().instantiateIfPoly(alg().boundValue(alg().id(constrToken))), alg().given()),
                //patt));
        /*return alg().abs(alg().variantMatch(
                alg().tag(constrToken),
                alg().apply(alg().instantiateIfPoly(alg().boundValue(alg().nameId("variant_selector", constrToken))), alg().given()),
                patt
        ));*/
    }

    @Syntax("patt = <assoc=left> patt '|' patt") @Level(80)
    default E optionalPatt(E p1, E p2) {
        return alg().pattNonBinding(alg().preferOver(p1, p2));
    }
}
