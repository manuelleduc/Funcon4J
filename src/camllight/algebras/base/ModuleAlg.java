package camllight.algebras.base;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.storage.EnvironmentAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ModuleAlg<E, A extends EnvironmentAlg<E> & LogicControlAlg<E> & PrintAlg<E>> {
    A alg();

    //|[ prog[: IMPL :] ]| ->
    //|[ scope(accum(cl_base,cl_library), decl_impl[: IMPL :]) ]|
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
        return alg().seq(alg().print(exp), alg().environment());
    }

    @Syntax("declorexp = decl") @Level(0)
    default E declOrExpDecl(E decl) {
        return decl;
    }
}
