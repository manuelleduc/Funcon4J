package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.truffle.entities.BindingBindValueNode;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode intToFloat(FNCExecuteNode i) {
        return new IntToFloat(i);
    }

    @Override
    default FNCExecuteNode floatToInt(FNCExecuteNode f) {
        return new FloatToInt(f);
    }

    class IntToFloat implements FNCExecuteNode {
        private final FNCExecuteNode i;

        public IntToFloat(FNCExecuteNode i) {
            this.i = i;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new IntoFloatConversionIntToFloatNode((FNCExpressionNode) i);
        }
    }

    class FloatToInt implements FNCExecuteNode {
        private final FNCExecuteNode f;

        public FloatToInt(FNCExecuteNode f) {
            this.f = f;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new IntoFloatConversionFloatToIntoNode((FNCExpressionNode) f);
        }
    }
}
