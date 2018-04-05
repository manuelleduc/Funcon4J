package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Bool Not Node")
public class BoolNotNode extends Node implements FNCExecuteNode {
    @Node.Child
    private FNCExecuteNode b;

    public BoolNotNode(FNCExecuteNode b) {
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((IBool) b.buildAST()).not();
//    }
}
