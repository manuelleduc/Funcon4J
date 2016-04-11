package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;
import funcons.types.Abs;
import funcons.types.Environment;
import funcons.types.Null;
import funcons.types.Value;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return (env, given) -> new Abs<>(exp);
        //return (Environment env) -> new Abs<>(exp).body().eval(env);
    }

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return supply(arg, unAbs(abs));
        //return (Environment env) -> supply(arg, ((Abs<IEval>)abs.eval(env)).body()).eval(env);
    }

    @Override
    default IEval bind(IEval var) {
        return abs(bindValue(var, given()));
    }

    default IEval unAbs(IEval abs) {
        return (env, given) -> ((Abs<IEval>)abs.eval(env, given)).body().eval(env, given);
    }
}
