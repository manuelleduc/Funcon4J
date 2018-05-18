package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<FNCBuildAST> {
    @Override
    default FNCBuildAST intToFloat(FNCBuildAST i) {
        return new IntToFloat(i);
    }

    @Override
    default FNCBuildAST floatToInt(FNCBuildAST f) {
        return new FloatToInt(f);
    }

    class IntToFloat implements FNCBuildAST {
        private final FNCBuildAST i;

        public IntToFloat(FNCBuildAST i) {
            this.i = i;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return IntoFloatConversionIntToFloatNodeGen.create(i.buildAST(l));
        }
    }

    class FloatToInt implements FNCBuildAST {
        private final FNCBuildAST f;

        public FloatToInt(FNCBuildAST f) {
            this.f = f;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return IntoFloatConversionFloatToIntoNodeGen.create(f.buildAST(l));
        }
    }
}
