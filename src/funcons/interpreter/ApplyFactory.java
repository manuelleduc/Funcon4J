package funcons.interpreter;

import funcons.algebras.ApplyAlg;
import funcons.sorts.IEval;

public interface ApplyFactory extends BindFactory, ApplyAlg<IEval> {

    @Override
    default IEval abs(IEval exp) {
        return exp;
        //return (Environment env) -> new Abs<>(exp).body().eval(env);
    }

    @Override
    default IEval apply(IEval abs, IEval arg) {
        return supply(arg, abs);
        //return (Environment env) -> supply(arg, ((Abs<IEval>)abs.eval(env)).body()).eval(env);
    }

    @Override
    default IEval match(IEval exp, IEval pat) {
        return apply(pat, exp);
    }

    @Override
    default IEval bind(IEval var) {
        return abs(bindValue(var, given()));
    }

    @Override
    default IEval pattAbs(IEval pat, IEval x) {
        return abs(scope(match(given(), pat), x));
    }
}
