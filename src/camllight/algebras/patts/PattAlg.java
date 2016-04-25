package camllight.algebras.patts;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface PattAlg<E> extends StartAlg<E> {

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

    @Syntax("patt = WILDCARD")
    default E pattWildcard(String wildcard) {
        return alg().any();
    }

    @Syntax("patt = constant")
    default E pattConstant(E constant) {
        return alg().only(constant);
    }
}
