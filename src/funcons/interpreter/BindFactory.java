package funcons.interpreter;

import funcons.algebras.BindAlg;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Variable;

public interface BindFactory extends LogicWhileTrueFactory, BindAlg<IEval> {
    @Override
    default IEval var(java.lang.String s) {
        return (Environment env) -> new Variable(s);
    }

    @Override
    default IEval bindValue(IEval var, IEval exp) {
        return (Environment env) -> new Environment(((Variable)var.eval(env)), exp.eval(env));
    }

    @Override
    default IEval boundValue(IEval var) {
        return (Environment env) -> env.val((Variable)var.eval(env));
    }

    @Override
    default IEval scope(IEval localBindings, IEval exp) {
        return (Environment env) -> localBindings.eval(env.extend((Environment)localBindings.eval(env)));
    }

    @Override
    default IEval given() {
        return Environment::given;
    }

    @Override
    default IEval supply(IEval exp) {
        return (Environment env) -> env.supply(exp.eval(env));
    }
}
