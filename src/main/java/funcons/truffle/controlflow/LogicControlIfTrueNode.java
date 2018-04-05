package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;


@NodeInfo(description = "LogicControl IfTrue Node")
public class LogicControlIfTrueNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode e;
    @Child
    private CLExecuteNode c1;
    @Child
    private CLExecuteNode c2;

    public LogicControlIfTrueNode(CLExecuteNode e, CLExecuteNode c1, CLExecuteNode c2) {
        this.e = e;
        this.c1 = c1;
        this.c2 = c2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return (((IBool) e.buildAST()).getValue() ? c1 : c2).buildAST();
//    }
}
