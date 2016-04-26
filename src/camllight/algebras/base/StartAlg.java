package camllight.algebras.base;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface StartAlg<E> {
    funcons.algebras.TypeAlg<E> alg();

    @Syntax("prog = exp")
    default E start(E e) {
        return e;
    }

    @Syntax("ident = IDTOKEN") @Level(0)
    default E id(java.lang.String name) {
        return alg().id(name);
    }

    @Syntax("type = IDTOKEN") @Level(0)
    default E typeId(java.lang.String name) {
        return alg().type(name);
    }

    // Not part of the language, just used for easy testing purposes
    @Syntax("exp = 'print' exp")
    default E print(E e) {
        return alg().print(e);
    }
}
