package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Exception Else Node")
public class ExceptionElseNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode x2;

    @Node.Child
    private FNCExecuteNode x1;

    public ExceptionElseNode(FNCExecuteNode x1, FNCExecuteNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        try {
//            return x1.buildAST();
//        } catch (FailureTrue f) {
//            return x2.buildAST();
//        }
//    }
}
