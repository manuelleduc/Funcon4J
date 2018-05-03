package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.profiles.BranchProfile;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

import static com.oracle.truffle.api.nodes.Node.*;

@NodeInfo(shortName = "body")
public class FunctionAbsNode extends FNCExpressionNode  {

    @Child
    private FNCExpressionNode bodyNode;

//    private final BranchProfile exceptionTaken = BranchProfile.create();
//    private final BranchProfile nullTaken = BranchProfile.create();

    public FunctionAbsNode(FNCExpressionNode exp) {
        this.bodyNode = exp;
    }


    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        try {
//            bodyNode.executeVoid(frame);
//        } catch (FNCReturnException e) {
//            exceptionTaken.enter();
//            return e.getResult();
//        } catch (RunTimeFunconException e) {
//            e.printStackTrace();
//        }
//
//        nullTaken.enter();
//
//        return null;

        return bodyNode.executeGeneric(frame);
    }
}
