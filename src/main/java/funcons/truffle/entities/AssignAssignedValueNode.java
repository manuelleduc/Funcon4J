package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Variable;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode var;

    public AssignAssignedValueNode(CLExecuteNode var) {
        this.var = var;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((Variable) var.buildAST()).value();
//    }
}
