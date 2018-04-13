package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Greater Node ")
public class BoolGreaterNode extends FNCExpressionNode  {

    ValueFactory vf = ValueFactory.getInstance();

    @Child
    private FNCExpressionNode a;

    @Child
    private FNCExpressionNode b;

    public BoolGreaterNode(FNCExpressionNode a, FNCExpressionNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            return a.executeIInteger(frame).greater(b.executeIInteger(frame));
        } catch (UnexpectedResultException | RunTimeFunconException e) {
            e.printStackTrace();
        }
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue aVal = a.buildAST();
//        final IValue bVal = b.buildAST();
//        return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//    }
}
