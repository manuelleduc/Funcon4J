package funcons.interpreter.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.carriers.IEval;
import funcons.values.Float;
import funcons.values.Int;

public interface IntFloatConversionFactory extends IntFloatConversionAlg<IEval> {
    @Override
    default IEval intToFloat(IEval i) {
        return (env, forwards, store, given) -> new Float(((Int)i.eval(env, forwards, store, given)).floatValue());
    }

    @Override
    default IEval floatToInt(IEval f) {
        return (env, forwards, store, given) -> new Int(((Float)f.eval(env, forwards, store, given)).intValue());
    }
}
