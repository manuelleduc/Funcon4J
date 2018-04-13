package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode intToFloat(FNCExecuteNode i) {
        return new IntoFloatConversionIntToFloatNode((FNCExpressionNode) i);
    }

    @Override
    default FNCExecuteNode floatToInt(FNCExecuteNode f) {
        return new IntoFloatConversionFloatToIntoNode((FNCExpressionNode) f);
    }
}
