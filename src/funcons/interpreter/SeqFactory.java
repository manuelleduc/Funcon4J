package funcons.interpreter;

import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;

public interface SeqFactory extends EffectFactory, SeqAlg<IEval> {
    @Override
    default IEval seq(IEval c, IEval t) {
        return (Environment env) -> {
            c.eval(env);
            return t.eval(env);
        };
    }
}
