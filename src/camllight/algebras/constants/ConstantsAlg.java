package camllight.algebras.constants;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface ConstantsAlg<E> extends StartAlg<E> {
    @Syntax("constant = NUM")
    default E int_(java.lang.Integer l) {
        return alg().lit(l);
    }

    @Syntax("constant = BOOL")
    default E bool(java.lang.Boolean b) {
        return alg().bool(b);
    }

    @Syntax("constant = NOTHING")
    default E null_(Object o) {
        return alg().null_();
    }
}
