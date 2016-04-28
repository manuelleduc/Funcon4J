package camllight.algebras.typeexprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface TypeExpAlg<E> extends StartAlg<E> {

    @Syntax("type = '(' type ')'")
    default E bracketedType(E type) {
        return type;
    }
}
