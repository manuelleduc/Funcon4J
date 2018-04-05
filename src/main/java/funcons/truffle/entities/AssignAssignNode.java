package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;
import funcons.values.Variable;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends Node implements CLExecuteNode {

    private final NullAlg<CLExecuteNode> nalg;
    @Node.Child
    private CLExecuteNode var;

    @Node.Child
    private CLExecuteNode x;

    public AssignAssignNode(CLExecuteNode var, CLExecuteNode x, NullAlg<CLExecuteNode> nalg) {
        this.var = var;
        this.x = x;
        this.nalg = nalg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        ((Variable) var.buildAST()).store(x.buildAST());
//        return nalg.null_().buildAST();
//    }
}
