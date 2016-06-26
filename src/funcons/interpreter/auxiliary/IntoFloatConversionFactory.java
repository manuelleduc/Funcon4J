package funcons.interpreter.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IReal;

public interface IntoFloatConversionFactory extends IntFloatConversionAlg<IEval> {
    @Override
    default IEval intToFloat(IEval i) {
        return (env, store, given) -> ((IInteger)i.eval(env, store, given)).toReal(5);
    }

    @Override
    default IEval floatToInt(IEval f) {
        return (env, store, given) -> ((IReal)f.eval(env, store, given)).toInteger();
    }
}
