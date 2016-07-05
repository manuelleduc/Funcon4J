package camllight.algebras.toplevel;

import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ModuleAlg<E, A extends BindingAlg<E> & LogicControlAlg<E>> {
    A alg();

    @Syntax("prog = declimpl")
    default E start(E e) {
        return e;
    }

    @Syntax("declimpl = declorexp ';;' declimpl") @Level(1)
    default E declImpl(E decl, E declImpl) {
        return alg().accum(decl, declImpl);
    }

    @Syntax("declimpl = declorexp ';;'") @Level(0)
    default E declImplSingle(E decl) {
        return decl;
    }

    @Syntax("declorexp = exp") @Level(1)
    default E declOrExpExp(E exp) {
        return alg().seq(exp, alg().environment());
    }

    @Syntax("declorexp = decl") @Level(0)
    default E declOrExpDecl(E decl) {
        return decl;
    }
}