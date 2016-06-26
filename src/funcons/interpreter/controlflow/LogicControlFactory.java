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
        return (env, store, given) -> {
            e.eval(env, store, given);
            return null_().eval(env, store, given);
        };
    }

    @Override
    default IEval seq(IEval c, IEval t) {
        return (env, store, given) -> {
            c.eval(env, store, given);
            return t.eval(env, store, given);
        };
    }

    @Override
    default IEval ifTrue(IEval e, IEval c1, IEval c2) {
        return (env, store, given) ->
                (((IBool)e.eval(env, store, given)).getValue() ? c1 : c2).eval(env, store, given);
    }

    @Override
    default IEval whileTrue(IEval e, IEval c) {
        return (env, store, given) -> {
            while (((IBool)e.eval(env, store, given)).getValue()) {
                c.eval(env, store, given);
            }
            return null_().eval(env, store, given);
        };
/*        return ifTrue(
                e,
                seq(c, (env, forward, store, given) -> whileTrue(e, c).eval(env, forward, store, given)),
                null_()
        );*/
    }

    @Override
    default IEval for_(IEval id, IEval startValue, IEval cond, IEval incr, IEval exp) {
        return null;
        /*return (env, forward, store, given) -> {
            for (env = env.join((Environment)bindValue(id, startValue).eval(env, forward, store, given));
                 ((Bool)cond.eval(env, forward, store, given)).boolValue();
                 env = env.join((Environment)bindValue(id, incr).eval(env, forward, store, given))) {
                exp.eval(env, forward, store, given);
            }
            return null_().eval(env, forward, store, given);
        };*/
    }
}
