package funcons.truffle.auxiliary;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.auxiliary.IntFloatConversionAlg;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode intToFloat(FNCExecuteNode i) {
        return new IntoFloatConversionIntToFloatNode(i);
    }

    @Override
    default FNCExecuteNode floatToInt(FNCExecuteNode f) {
        return new IntoFloatConversionFloatToIntoNode(f);
    }
}
