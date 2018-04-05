package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode var;

    public AssignAssignedValueNode(FNCExecuteNode var) {
        this.var = var;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((Variable) var.buildAST()).value();
//    }
}
