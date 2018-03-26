package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleIntoFloatConversionFactory extends IntFloatConversionAlg<CLStatementNode> {
    @Override
    default CLStatementNode intToFloat(CLStatementNode i) {
//        return (env, given) -> ((IInteger) i.eval(env, given)).toReal(5);
        return null; // TODO
    }

    @Override
    default CLStatementNode floatToInt(CLStatementNode f) {
//        return (env, given) -> ((IReal) f.eval(env, given)).toInteger();
        return null; // TODO
    }
}
