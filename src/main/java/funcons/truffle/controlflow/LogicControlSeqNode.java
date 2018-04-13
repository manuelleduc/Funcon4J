package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends FNCExpressionNode  {
    @Child
    private FNCExpressionNode c;
    @Child
    private FNCExpressionNode t;

    public LogicControlSeqNode(FNCExpressionNode c, FNCExpressionNode t) {
        this.c = c;
        this.t = t;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        this.c.executeGeneric(frame);
        return this.t.executeGeneric(frame);
    }

    //    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        c.buildAST();
//        return t.buildAST();
//    }
}
