package funcons.interpreter.commands;

import funcons.algebras.commands.PrintAlg;
import funcons.carriers.IEval;
import funcons.interpreter.values.NullFactory;

public interface PrintFactory extends NullFactory, PrintAlg<IEval> {
    @Override
    default IEval print(IEval x) {
        return (env, forward, store, given) -> {
            System.out.print(x.eval(env, forward, store, given));
            return null_().eval(env, forward, store, given);
        };
    }
}
