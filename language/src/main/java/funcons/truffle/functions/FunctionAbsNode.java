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

    public FunctionAbsNode(FNCExpressionNode exp) {
        this.bodyNode = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }
}
