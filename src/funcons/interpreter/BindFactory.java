package funcons.interpreter;

import funcons.algebras.BindAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Variable;

public interface BindFactory extends LogicWhileTrueFactory, BindAlg<IEval> {
    @Override
    default IEval var(java.lang.String s) {
        return (env, store, given) -> new Variable(s);
    }

    @Override
    default IEval bindValue(IEval var, IEval exp) {
        return (env, store, given) -> new Environment(((Variable)var.eval(env, store, given)), exp.eval(env, store, given));
    }

    @Override
    default IEval boundValue(IEval var) {
        return (env, store, given) -> env.val((Variable)var.eval(env, store, given));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (env, store, given) -> exp.eval(env.extend((Environment)localBindings.eval(env, store, given)), store, given);
    }

    @Override
    default IEval given() {
        return (env, store, given) -> given;
    }

    @Override
    default IEval supply(IEval exp, IEval x) {
        return (env, store, given) -> x.eval(env, store, exp.eval(env, store, given));
    }
}
