package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends Node
        implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode x;

    @Node.Child
    private FNCExecuteNode environment;

    public BindingClosureNode(FNCExecuteNode x, FNCExecuteNode environment) {
        this.x = x;
        this.environment = environment;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//    }
}
