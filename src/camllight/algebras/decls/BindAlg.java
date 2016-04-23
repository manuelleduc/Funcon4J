package camllight.algebras.decls;

import camllight.algebras.base.StartAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BindAlg<E> extends StartAlg<E> {

    @Syntax("decl = 'let' decl") @Level(0)
    default E decl(E dec) {
        return dec;
    }

    @Syntax("decl = patt '=' exp")
    default E declBindPatt(E patt, E exp) {
        return declBindPattMono(patt, exp);
    }

    @Syntax("declpattmono = patt '=' exp")
    default E declBindPattMono(E patt, E exp) {
        return alg().match(exp, alg().preferOver(patt, alg().abs(alg().throw_(alg().matchFailure()))));
    }

}
