package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Null Null Node")
public class NullNullNode extends Node implements CLExecuteNode {
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Null();
//    }
}
