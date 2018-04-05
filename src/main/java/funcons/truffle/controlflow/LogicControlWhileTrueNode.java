package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends Node implements CLExecuteNode {

    private final NullAlg<CLExecuteNode> nalg;
    @Node.Child
    private CLExecuteNode e;

    @Node.Child
    private CLExecuteNode c;

    public LogicControlWhileTrueNode(CLExecuteNode e, CLExecuteNode c, NullAlg<CLExecuteNode> nalg) {
        this.e = e;
        this.c = c;
        this.nalg = nalg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        while (((IBool) e.buildAST(env, given)).getValue()) {
            c.buildAST(env, given);
        }
        return nalg.null_().buildAST(env, given);
    }
}
