package funcons.truffle.auxiliary;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
public class IntoFloatConversionIntToFloatNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode i;

    public IntoFloatConversionIntToFloatNode(FNCExecuteNode i) {
        this.i = i;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IInteger) i.buildAST()).toReal(5);
//        return this;
//    }
}
