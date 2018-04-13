package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Function Abs Node 2")
public class FunctionAbsNode2 extends FNCExpressionNode implements FNCExecuteNode {

    @Child
    FNCExpressionNode patt;

    @Child
    FNCExpressionNode exp;

    public FunctionAbsNode2(FNCExpressionNode patt, FNCExpressionNode exp) {
        this.patt = patt;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("executeGeneric not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Abs<CLExecuteNode>(() -> {
//            @SuppressWarnings("unchecked")
//            CLExecuteNode environment = ((Abs<CLExecuteNode>) patt.buildAST()).body();
//            return alg.scope(environment, exp).buildAST();
//        });
//    }
}
