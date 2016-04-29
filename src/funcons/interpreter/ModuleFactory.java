package funcons.interpreter;

import funcons.algebras.ModuleAlg;
import funcons.sorts.IEval;

public interface ModuleFactory extends TypeFactory, ModuleAlg<IEval> {

    @Override
    default IEval accum(IEval env, IEval decl) {
        return scope(env, environmentOver(decl, env));
    }
}
