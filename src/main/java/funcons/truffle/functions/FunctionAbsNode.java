package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Abs;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Function Abs Node")
public class FunctionAbsNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode exp;

    public FunctionAbsNode(CLExecuteNode exp) {
        this.exp = exp;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Abs<>(exp);
//    }
}
