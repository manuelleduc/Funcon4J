package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;
import funcons.types.Abs;
import funcons.types.Environment;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return (Environment env) -> new Abs<>(exp);
        //return (Environment env) -> new Abs<>(exp).body().eval(env);
    }

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return supply(arg, (Environment env) -> ((Abs<IEval>)abs.eval(env)).body().eval(env));
        //return (Environment env) -> supply(arg, ((Abs<IEval>)abs.eval(env)).body()).eval(env);
    }

    @Override
    default IEval match(IEval exp, IEval pat) {
        return apply(pat, exp);
    }

    @Override
    default IEval bind(IEval var) {
        return bindValue(var, given());
        //return abs(bindValue(var, given()));
    }

    @Override
    default IEval pattAbs(IEval pat, IEval x) {
        return abs(scope(match(given(), pat), x));
    }
}
