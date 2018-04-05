package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends Node
        implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode x;

    @Node.Child
    private CLExecuteNode environment;

    public BindingClosureNode(CLExecuteNode x, CLExecuteNode environment) {
        this.x = x;
        this.environment = environment;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//    }
}
