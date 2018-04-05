package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode id;

    public BindingBoundValueNode(CLExecuteNode id) {
        this.id = id;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return env.get(id.buildAST());
//    }
}
