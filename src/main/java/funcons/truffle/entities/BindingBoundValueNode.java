package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode id;

    public BindingBoundValueNode(FNCExecuteNode id) {
        this.id = id;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return env.get(id.buildAST());
//    }
}
