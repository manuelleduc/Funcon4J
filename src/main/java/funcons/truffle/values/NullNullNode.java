package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;

@NodeInfo(description = "Null Null Node")
public class NullNullNode extends FNCExpressionNode  {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new Null();
    }


//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Null();
//    }
}
