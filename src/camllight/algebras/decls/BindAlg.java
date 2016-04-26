package camllight.algebras.decls;

import camllight.algebras.base.StartAlg;
import camllight.algebras.patts.PattMatchAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface BindAlg<E> extends StartAlg<E>, PattMatchAlg<E> {

    @Syntax("decl = 'let' decl") @Level(1)
    default E decl(E dec) {
        return dec;
    }

    @Syntax("decl = declmono 'and' decl") @Level(0)
    default E andDecl(E d1, E d2) {
        return alg().environmentUnion(d1, d2);
    }

    @Syntax("decl = declmono")
    default E declBind(E d) {
        return d;
    }

    @Syntax("declmono = patt '=' exp")
    default E declBindMono(E patt, E exp) {
        return alg().match(exp, alg().preferOver(patt, alg().abs(alg().throw_(alg().matchFailure()))));
    }

    @Syntax("declmono = ident patt+ '=' exp")
    default E declBindMonoFunc(E id, java.util.List<E> patts, E exp) {
        return alg().bindValue(id, pattMatchCurriedMulti(patts, exp));
    }

    /*
      to-funcons:
    |[ decl_mono[: ~V ~PP = ~E :] ]| ->
    |[ bind_value(id[: ~V :], expr[: fun ~PP -> ~E :]) ]|
     */
}
