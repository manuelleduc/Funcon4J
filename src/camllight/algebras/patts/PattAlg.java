package camllight.algebras.patts;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface PattAlg<E> extends StartAlg<E> {

    @Syntax("patt = ident")
    default E pattId(E id) {
        return alg().bind(id);
    }

    @Syntax("patt = '_'")
    default E pattWildcard() {
        return alg().any();
    }

    @Syntax("patt = constant")
    default E pattConstant(E constant) {
        return alg().only(constant);
    }
}
