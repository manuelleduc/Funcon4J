package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.values.Abs;

@NodeInfo(description = "Function Apply Node")
public class FunctionApplyNode extends FNCExpressionNode implements FNCExecuteNode {
    private final SupplyGivenAlg<FNCExecuteNode> salg;

    @Child
    private FNCExecuteNode functionNode;

    @Child
    private FNCExecuteNode argumentNode;

    @Child
    private FNCDispatchNode dispatchNode;

    public FunctionApplyNode(FNCExecuteNode functionNode, FNCExecuteNode argumentNode, SupplyGivenAlg<FNCExecuteNode> salg) {
        this.functionNode = functionNode;
        this.argumentNode = argumentNode;
        this.salg = salg;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return salg.supply(argumentNode,
                ((Abs<FNCExecuteNode>) functionNode.buildAST()).body()).buildAST();
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return salg.supply(argumentNode,
//                ((Abs<CLExecuteNode>) functionNode.buildAST()).body()).buildAST();
//    }
}
