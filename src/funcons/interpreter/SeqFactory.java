package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.carriers.IEval;

public interface SeqFactory extends EffectFactory, SeqAlg<IEval> {
    @Override
    default IEval seq(IEval c, IEval t) {
        return (env, forward, store, given) -> {
            c.eval(env, forward, store, given);
            return t.eval(env, forward, store, given);
        };
    }
}