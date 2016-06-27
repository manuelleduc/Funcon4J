package funcons.interpreter.controlflow;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;
import funcons.values.Abs;
import funcons.values.cl.CLMatchFailureException;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.RunTimeFunconException;
import org.rascalmpl.value.IValueFactory;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public interface ExceptionFactory extends
        LogicControlAlg<IEval>,
        FunctionAlg<IEval>,
        SupplyGivenAlg<IEval>,
        ExceptionAlg<IEval> {

    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval fail() {
        return (env, given) -> {
            throw new FailureTrue();
        };
    }

    @Override
    default IEval whenTrue(IEval exp, IEval x) {
        return ifTrue(exp, x, fail());
    }

    @Override
    default IEval matchFailure() {
        return (env, given) -> new CLMatchFailureException(vf);
    }

    @Override
    default IEval exception(java.lang.String message) {
        return (env, given) -> new RunTimeFunconException(message);
    }

    @Override
    default IEval exception(java.lang.String message, IEval val) {
        return (env, given) -> new RunTimeFunconException(message, val.eval(env, given));
    }

    @Override
    default IEval throw_(IEval s) {
        return (env, given) -> {
            throw (RunTimeFunconException)s.eval(env, given);
        };
    }

    @Override
    default IEval catch_(IEval x, IEval abs) {
        return (env, given) -> {
            try {
                return x.eval(env, given);
            } catch (RunTimeFunconException e) {
                return apply(abs, (env1, given1) -> e).eval(env, given);
            }
        };
    }

    @Override
    default IEval catchElseRethrow(IEval x, IEval abs) {
        return catch_(x, preferOver(abs, abs(throw_(given()))));
    }

    @Override
    default IEval else_(IEval x1, IEval x2) {
        return (env, given) -> {
            try {
                return x1.eval(env, given);
            } catch(FailureTrue f) {
                return x2.eval(env, given);
            }
        };
    }

    @Override
    @SuppressWarnings("unchecked")
    default IEval preferOver(IEval a1, IEval a2) {
        return (env, given) ->
                abs(else_(
                        ((Abs<IEval>)a1.eval(env, given)).body(),
                        ((Abs<IEval>)a2.eval(env, given)).body()
                )).eval(env, given);
    }
}
