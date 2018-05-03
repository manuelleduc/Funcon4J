package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunctionRegistry;
import funcons.truffle.nodes.FNCLanguage;
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

        Object r2 = this.t.executeGeneric(frame);
        Object r1 = this.c.executeGeneric(frame);



//        reg.lookup(r2, false);
        return r1;
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
