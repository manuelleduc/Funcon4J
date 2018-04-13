package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Bool GreaterEqual Node")
public class BoolGreaterEqualNode extends FNCExpressionNode  {

    @Child
    private FNCExpressionNode a;
    @Child
    private FNCExpressionNode b;


    public BoolGreaterEqualNode(FNCExpressionNode a, FNCExpressionNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            return a.executeIInteger(frame).greaterEqual(b.executeIInteger(frame));
        } catch (UnexpectedResultException | RunTimeFunconException e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        if (((IBool) alg.greater(a, b).buildAST()).getValue()) {
//            return alg.bool(true).buildAST();
//        }
//        return alg.equal(a, b).buildAST();
//    }
}
