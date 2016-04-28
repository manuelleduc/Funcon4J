package camllight.algebras.typeexprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface TypeExpAlg<E> extends StartAlg<E> {

    @Syntax("type = '(' type ')'")
    default E bracketedType(E type) {
        return type;
    }

    @Syntax("type = ident")
    default E typeId(E id) {
        return alg().boundType(id);
    }

    /*
    @Syntax("type = type '->' type")
    default E functionType(E t1, E t2) {
        return
    }*/
}
