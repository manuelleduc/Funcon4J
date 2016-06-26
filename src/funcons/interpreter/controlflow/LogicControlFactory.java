package funcons.interpreter.controlflow;

import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IBool;

public interface LogicControlFactory extends
        NullAlg<IEval>,
        FunctionAlg<IEval>,
        EnvironmentAlg<IEval>,
        LogicControlAlg<IEval> {

    @Override
    default IEval effect(IEval e) {
        return (env, given) -> {
            e.eval(env, given);
            return null_().eval(env, given);
        };
    }

    @Override
    default IEval seq(IEval c, IEval t) {
        return (env, given) -> {
            c.eval(env, given);
            return t.eval(env, given);
        };
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, given) ->
                (((IBool)e.eval(env, given)).getValue() ? c1 : c2).eval(env, given);
    }

    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return (env, given) -> {
            while (((IBool)e.eval(env, given)).getValue()) {
                c.eval(env, given);
            }
            return null_().eval(env, given);
        };
/*        return ifTrue(
                e,
                seq(c, (env, forward, given) -> whileTrue(e, c).eval(env, forward, given)),
                null_()
        );*/
    }

    @Override
    default IEval for_(IEval id, IEval startValue, IEval cond, IEval incr, IEval exp) {
        return null;
        /*return (env, forward, given) -> {
            for (env = env.join((Environment)bindValue(id, startValue).eval(env, forward, given));
                 ((Bool)cond.eval(env, forward, given)).boolValue();
                 env = env.join((Environment)bindValue(id, incr).eval(env, forward, given))) {
                exp.eval(env, forward, given);
            }
            return null_().eval(env, forward, given);
        };*/
    }
}
