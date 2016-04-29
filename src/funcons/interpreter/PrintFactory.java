package funcons.interpreter;

import funcons.algebras.PrintAlg;
import funcons.sorts.IEval;
import funcons.values.Null;

public interface PrintFactory extends IntCalcFactory, PrintAlg<IEval> {
    @Override
    default IEval print(IEval x) {
        return (env, store, given) -> {
            System.out.print(x.eval(env, store, given));
            return new Null();
        };
    }
}
