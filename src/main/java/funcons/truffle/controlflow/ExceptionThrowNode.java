package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Exception Thrown Node")
public class ExceptionThrowNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode s;

    public ExceptionThrowNode(CLExecuteNode s) {
        this.s = s;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        throw (RunTimeFunconException) s.buildAST();
//    }
}
