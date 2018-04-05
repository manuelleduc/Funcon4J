package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Exception Else Node")
public class ExceptionElseNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode x2;

    @Node.Child
    private CLExecuteNode x1;

    public ExceptionElseNode(CLExecuteNode x1, CLExecuteNode x2) {
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
