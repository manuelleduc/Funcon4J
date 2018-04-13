package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Function Apply Node")
public class FunctionApplyNode extends FNCExpressionNode implements FNCExecuteNode {

    @Child
    private FNCExpressionNode functionNode;

    @Child
    private FNCExpressionNode argumentNode;

    @Child
    private FNCDispatchNode dispatchNode;

    public FunctionApplyNode(FNCExpressionNode functionNode, FNCExpressionNode argumentNode) {
        this.functionNode = functionNode;
        this.argumentNode = argumentNode;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        return salg.supply(argumentNode,
//                ((Abs<FNCExecuteNode>) functionNode.buildAST()).body()).buildAST();
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return salg.supply(argumentNode,
//                ((Abs<CLExecuteNode>) functionNode.buildAST()).body()).buildAST();
//    }
}
