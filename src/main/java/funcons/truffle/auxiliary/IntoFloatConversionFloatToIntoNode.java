package funcons.truffle.auxiliary;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
public class IntoFloatConversionFloatToIntoNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode f;

    public IntoFloatConversionFloatToIntoNode(FNCExpressionNode f) {
        this.f = f;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IReal) f.buildAST()).toInteger();
//        return this;
//    }
}
