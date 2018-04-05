package funcons.truffle.auxiliary;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
public class IntoFloatConversionFloatToIntoNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode f;

    public IntoFloatConversionFloatToIntoNode(FNCExecuteNode f) {
        this.f = f;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IReal) f.buildAST()).toInteger();
//        return this;
//    }
}
