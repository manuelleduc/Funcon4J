package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode localBindings;

    @Node.Child
    private FNCExecuteNode exp;

    public BindingScopeNode(FNCExecuteNode localBindings, FNCExecuteNode exp) {
        this.localBindings = localBindings;
        this.exp = exp;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IMap local = (IMap) localBindings.buildAST();
//        return exp.buildAST();
//    }
}
