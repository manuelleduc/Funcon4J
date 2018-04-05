package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "LogicControl IfTrue Node")
public class LogicControlIfTrueNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode e;
    @Child
    private FNCExecuteNode c1;
    @Child
    private FNCExecuteNode c2;

    public LogicControlIfTrueNode(FNCExecuteNode e, FNCExecuteNode c1, FNCExecuteNode c2) {
        this.e = e;
        this.c1 = c1;
        this.c2 = c2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return (((IBool) e.buildAST()).getValue() ? c1 : c2).buildAST();
//    }
}
