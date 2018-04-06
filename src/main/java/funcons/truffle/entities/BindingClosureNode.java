package funcons.truffle.entities;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;

import static com.oracle.truffle.api.nodes.Node.*;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode x;

    @Child
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
