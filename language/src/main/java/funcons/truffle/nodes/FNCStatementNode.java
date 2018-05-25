package funcons.truffle.nodes;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(language = "CL", description = "Abstract statement node")
public abstract class FNCStatementNode extends Node{
//    public abstract void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException;
}
