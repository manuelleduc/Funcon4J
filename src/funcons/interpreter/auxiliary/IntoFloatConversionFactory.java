package funcons.interpreter.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IReal;

public interface IntoFloatConversionFactory extends IntFloatConversionAlg<IEval> {
    @Override
    default IEval intToFloat(IEval i) {
        return (env, forwards, store, given) -> ((IInteger)i.eval(env, forwards, store, given)).toReal(5);
    }

    @Override
    default IEval floatToInt(IEval f) {
        return (env, forwards, store, given) -> ((IReal)f.eval(env, forwards, store, given)).toInteger();
    }
}
