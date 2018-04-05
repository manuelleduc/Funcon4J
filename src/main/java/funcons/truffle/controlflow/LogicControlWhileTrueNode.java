package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends Node implements CLExecuteNode {

    private final NullAlg<CLExecuteNode> nalg;
    @Node.Child
    private CLExecuteNode e;

    @Node.Child
    private CLExecuteNode c;

    public LogicControlWhileTrueNode(CLExecuteNode e, CLExecuteNode c, NullAlg<CLExecuteNode> nalg) {
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
