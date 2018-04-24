package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends FNCExpressionNode {
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

//        System.out.println("executeGeneric[LogicControlSeqNode] " + this);

        this.c.executeGeneric(frame);
        return this.t.executeGeneric(frame);
    }

    @Override
    public String toString() {
        return "LogicControlSeqNode{" +
                "c=" + c +
                ", t=" + t +
                '}';
    }


    //    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        c.buildAST();
//        return t.buildAST();
//    }
}
