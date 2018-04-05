package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends Node implements FNCExecuteNode {

    private final NullAlg<FNCExecuteNode> nalg;
    @Node.Child
    private FNCExecuteNode e;

    @Node.Child
    private FNCExecuteNode c;

    public LogicControlWhileTrueNode(FNCExecuteNode e, FNCExecuteNode c, NullAlg<FNCExecuteNode> nalg) {
        this.e = e;
        this.c = c;
        this.nalg = nalg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        while (((IBool) e.buildAST()).getValue()) {
//            c.buildAST();
//        }
//        return nalg.null_().buildAST();
//    }
}
