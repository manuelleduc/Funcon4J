package funcons.interpreter;

import funcons.algebras.PrintAlg;
import funcons.sorts.IEval;
import funcons.values.Null;
import funcons.values.recursion.Forwards;

public interface PrintFactory extends IntCalcFactory, PrintAlg<IEval> {
    @Override
    default IEval print(IEval x) {
        return (env, forward, store, given) -> {
            System.out.print(x.eval(env, forward, store, given));
            return new Null();
        };
    }
}
