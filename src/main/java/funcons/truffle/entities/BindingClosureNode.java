package funcons.truffle.entities;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode x;

    @Child
    FNCExpressionNode environment;

    public BindingClosureNode(FNCExpressionNode x, FNCExpressionNode environment) {
        this.x = x;
        this.environment = environment;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//    }
}
