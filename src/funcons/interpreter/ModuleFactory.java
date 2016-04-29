package funcons.interpreter;

import funcons.algebras.ModuleAlg;
import funcons.sorts.IEval;
import funcons.values.Environment;

public interface ModuleFactory extends TypeFactory, ModuleAlg<IEval> {

    @Override
    default IEval accum(IEval environment, IEval decl) {
        return (env, store, given) -> {
            Environment currentEnv = (Environment)environment.eval(env, store, given);
            return scope((e,s,g) -> currentEnv, environmentOver(decl, (e,s,g) -> currentEnv)).eval(env, store, given);
        };
    }
}
