package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;

@NodeInfo(description = "Function Apply Node")
public class FunctionApplyNode extends FNCExpressionNode {

    private final FNCLanguage language;
    @Child
    private FNCExpressionNode functionNode;

    @Child
    private FNCExpressionNode argumentNode;

    @Child
    private FNCDispatchNode dispatchNode;

    public FunctionApplyNode(FNCLanguage language, FNCExpressionNode functionNode, FNCExpressionNode argumentNode) {
        this.functionNode = functionNode;
        this.argumentNode = argumentNode;
        this.dispatchNode = FNCDispatchNodeGen.create();
        this.language = language;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final String functionName = (String) functionNode.executeGeneric(frame);
        final Object[] argumentValues = new Object[]{argumentNode.executeGeneric(frame)};
        final FunctionLiteralNode function = new FunctionLiteralNode(this.language, functionName);
        return dispatchNode.executeDispatch(function.executeGeneric(frame), argumentValues);
    }

    @Override
    public String toString() {
        return "FunctionApplyNode{" +
                ", functionNode=" + functionNode +
                ", argumentNode=" + argumentNode +
                ", dispatchNode=" + dispatchNode +
                '}';
    }
}
