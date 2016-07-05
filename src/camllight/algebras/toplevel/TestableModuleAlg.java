package camllight.algebras.toplevel;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface TestableModuleAlg<E, A extends BindingAlg<E> & LogicControlAlg<E> & PrintAlg<E>> extends ModuleAlg<E, A> {
    @Override
    @Syntax("declorexp = exp") @Level(1)
    default E declOrExpExp(E exp) {
        return alg().seq(alg().print(exp), alg().environment());
    }
}
