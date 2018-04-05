package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Exception Thrown Node")
public class ExceptionThrowNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode s;

    public ExceptionThrowNode(FNCExecuteNode s) {
        this.s = s;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        throw (RunTimeFunconException) s.buildAST();
//    }
}
