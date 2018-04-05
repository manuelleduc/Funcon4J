package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends Node implements FNCExecuteNode {

    private final NullAlg<FNCExecuteNode> nalg;
    @Node.Child
    private FNCExecuteNode var;

    @Node.Child
    private FNCExecuteNode x;

    public AssignAssignNode(FNCExecuteNode var, FNCExecuteNode x, NullAlg<FNCExecuteNode> nalg) {
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
