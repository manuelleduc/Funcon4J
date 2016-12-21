package funcons.interpreter.controlflow;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IBool;
import org.rascalmpl.value.IMap;

public interface LogicControlFactory extends
        NullAlg<IEval>,
        FunctionAlg<IEval>,
        BindingAlg<IEval>,
        MapAlg<IEval>,
        BoolAlg<IEval>,
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
    }

    @Override
    default IEval for_(IEval cond, IEval incr, IEval exp) {
        return (env, given) -> {
            for (; (((IBool) cond.eval(env, given)).getValue()); env = env.join((IMap)incr.eval(env, given))){
                exp.eval(env, given);
            }
            return null_().eval(env, given);
        };
    }
}
