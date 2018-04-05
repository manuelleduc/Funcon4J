package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Variable;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode x;

    public AssignAllocNode(CLExecuteNode x) {
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Variable(x.buildAST());
//    }
}
