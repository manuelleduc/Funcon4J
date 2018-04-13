package funcons.truffle.controlflow;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Exception Else Node")
public class ExceptionElseNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode x2;

    @Child
    FNCExpressionNode x1;

    public ExceptionElseNode(FNCExpressionNode x1, FNCExpressionNode x2) {
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
