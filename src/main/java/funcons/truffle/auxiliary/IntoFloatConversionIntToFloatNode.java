package funcons.truffle.auxiliary;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
public class IntoFloatConversionIntToFloatNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode i;

    public IntoFloatConversionIntToFloatNode(FNCExpressionNode i) {
        this.i = i;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IInteger) i.buildAST()).toReal(5);
//        return this;
//    }
}
