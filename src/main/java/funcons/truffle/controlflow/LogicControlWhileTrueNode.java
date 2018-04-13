package funcons.truffle.controlflow;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode e;

    @Child
    FNCExpressionNode c;

    public LogicControlWhileTrueNode(FNCExpressionNode e, FNCExpressionNode c) {
        this.e = e;
        this.c = c;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        while (((IBool) e.buildAST()).getValue()) {
//            c.buildAST();
//        }
//        return nalg.null_().buildAST();
//    }
}
