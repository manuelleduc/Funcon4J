package funcons.interpreter;

import funcons.algebras.BindAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Value;
import funcons.types.Variable;

public interface BindFactory extends LogicWhileTrueFactory, BindAlg<IEval> {
    @Override
    default IEval var(java.lang.String s) {
        return (Environment env, Value given) -> new Variable(s);
    }

    @Override
    default IEval bindValue(IEval var, IEval exp) {
        return (env, given) -> new Environment(((Variable)var.eval(env,given)), exp.eval(env, given));
    }

    @Override
    default IEval boundValue(IEval var) {
        return (env, given) -> env.val((Variable)var.eval(env, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, given) -> exp.eval(env.extend((Environment)localBindings.eval(env, given)), given);
    }

    @Override
    default IEval given() {
        return (env, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, given) -> x.eval(env, exp.eval(env, given));
    }
}
