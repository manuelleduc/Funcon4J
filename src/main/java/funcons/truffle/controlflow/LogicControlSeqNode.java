package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends Node implements CLExecuteNode {
    @Node.Child
    private CLExecuteNode c;
    @Node.Child
    private CLExecuteNode t;

    public LogicControlSeqNode(CLExecuteNode c, CLExecuteNode t) {
        this.c = c;
        this.t = t;
    }

    @Override
    public IValue eval(IMap env, Null given) throws FunconException {
        c.eval(env, given);
        return t.eval(env, given);
    }
}
