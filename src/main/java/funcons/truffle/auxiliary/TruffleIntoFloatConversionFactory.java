package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.auxiliary.IntFloatConversionAlg;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<CLExecuteNode> {
    @Override
    default CLExecuteNode intToFloat(CLExecuteNode i) {
        return new IntoFloatConversionIntToFloatNode(i);
    }

    @Override
    default CLExecuteNode floatToInt(CLExecuteNode f) {
        return new IntoFloatConversionFloatToIntoNode(f);
    }
}
