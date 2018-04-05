package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Undefined;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Null Undefined Node")
public class NullUndefinedNode extends Node implements CLExecuteNode {
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Undefined();
//    }
}
