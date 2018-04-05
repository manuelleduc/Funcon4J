package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


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

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return (((IBool) e.buildAST(env, given)).getValue() ? c1 : c2).buildAST(env, given);
    }
}
