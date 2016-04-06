package funcons.interpreter;

import funcons.algebras.EffectAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Null;

public interface EffectFactory extends IntCalcFactory, EffectAlg<IEval> {
    @Override
    default IEval effect(IEval e) {
        return (Environment env) -> {
            e.eval(env);
            return new Null();
        };
    }
}
