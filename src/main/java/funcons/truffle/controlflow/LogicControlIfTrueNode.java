package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import com.oracle.truffle.api.profiles.ConditionProfile;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "LogicControl IfTrue Node")
public class LogicControlIfTrueNode extends FNCExpressionNode implements FNCExecuteNode {
    @Node.Child
    private FNCExpressionNode e;
    @Node.Child
    private FNCExpressionNode c1;
    @Node.Child
    private FNCExpressionNode c2;

    private final ConditionProfile conditionProfile = ConditionProfile.createBinaryProfile();


    public LogicControlIfTrueNode(FNCExpressionNode e, FNCExpressionNode c1, FNCExpressionNode c2) {
        this.e = e;
        this.c1 = c1;
        this.c2 = c2;
    }

    private boolean testResult(VirtualFrame frame) throws UnexpectedResultException, RunTimeFunconException {
        return this.e.executeIBool(frame).getValue();
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            if (this.conditionProfile.profile(this.testResult(frame))) {
                return this.c1.executeGeneric(frame);
            } else {
               return  this.c2.executeGeneric(frame);
            }
        } catch (UnexpectedResultException | RunTimeFunconException e) {
            e.printStackTrace();
        }
        return null;
    }

}
