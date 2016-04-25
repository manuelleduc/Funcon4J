package camllight.algebras.decls;

import camllight.algebras.base.StartAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BindAlg<E> extends StartAlg<E> {

    @Syntax("decl = 'let' decl") @Level(1)
    default E decl(E dec) {
        return dec;
    }

    @Syntax("decl = declpattmono 'and' decl") @Level(0)
    default E andDecl(E d1, E d2) {
        return alg().environmentUnion(d1, d2);
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
