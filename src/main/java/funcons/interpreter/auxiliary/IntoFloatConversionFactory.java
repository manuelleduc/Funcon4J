package funcons.interpreter.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;

public interface IntoFloatConversionFactory extends IntFloatConversionAlg<IEval> {
    @Override
    default IEval intToFloat(IEval i) {
        return (env, given) -> ((IInteger)i.eval(env, given)).toReal(5);
    }

    @Override
    default IEval floatToInt(IEval f) {
        return (env, given) -> ((IReal)f.eval(env, given)).toInteger();
    }
}
