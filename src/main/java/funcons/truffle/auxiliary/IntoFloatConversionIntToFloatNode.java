package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
public class IntoFloatConversionIntToFloatNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode i;

    public IntoFloatConversionIntToFloatNode(CLExecuteNode i) {
        this.i = i;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IInteger) i.buildAST()).toReal(5);
//        return this;
//    }
}
