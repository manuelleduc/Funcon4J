package camllight.algebras.exprs;

import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.storage.BindAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.types.TypeAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ExpAlg
        <E, A extends
                RecursiveAlg<E> &
                PolyTypeAlg<E> &
                BindAlg<E> &
                TypeAlg<E> &
                funcons.algebras.functions.FunctionAlg<E>> {
    A alg();

    @Syntax("exp = constant") @Level(2700)
    default E constExp(E e) {
        return e;
    }

    @Syntax("exp = ident") @Level(2900)
    default E idExp(E id) {
        return alg().instantiateIfPoly(alg().followIfFwd(alg().boundValue(id)));
    }

    @Syntax("exp = '(' exp ')'") @Level(2600)
    default E bracketedExp(E e) {
        return e;
    }

    @Syntax("exp = 'begin' exp 'end'") @Level(2500)
    default E beginEndExp(E e) {
        return e;
    }

    @Syntax("exp = '(' exp ':' type ')'") @Level(2400)
    default E typedExp(E exp, E type) {
        return alg().typed(exp, type);
    }

    @Syntax("exp = CONSTRTOKEN exp") @Level(2200)
    default E constrExp(java.lang.String constrToken, E exp) {
        return alg().apply(alg().boundValue(alg().id(constrToken)), exp);
    }
}
