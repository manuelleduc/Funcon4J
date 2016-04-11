package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;

public interface SeqFactory extends EffectFactory, SeqAlg<IEval> {
    @Override
    default IEval seq(IEval c, IEval t) {
        return (env, given) -> {
            c.eval(env, given);
            return t.eval(env, given);
        };
    }
}
