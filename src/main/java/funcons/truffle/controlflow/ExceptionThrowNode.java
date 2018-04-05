package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Exception Thrown Node")
public class ExceptionThrowNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode s;

    public ExceptionThrowNode(CLExecuteNode s) {
        this.s = s;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        throw (RunTimeFunconException) s.buildAST(env, given);
    }
}
