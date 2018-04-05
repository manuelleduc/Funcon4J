package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;


@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode localBindings;

    @Node.Child
    private CLExecuteNode exp;

    public BindingScopeNode(CLExecuteNode localBindings, CLExecuteNode exp) {
        this.localBindings = localBindings;
        this.exp = exp;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IMap local = (IMap) localBindings.buildAST();
//        return exp.buildAST();
//    }
}
