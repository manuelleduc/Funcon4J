package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
public class IntoFloatConversionFloatToIntoNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode f;

    public IntoFloatConversionFloatToIntoNode(CLExecuteNode f) {
        this.f = f;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        return ((IReal) f.buildAST()).toInteger();
//        return this;
//    }
}
