package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

import static com.oracle.truffle.api.nodes.Node.*;

@NodeInfo(description = "Recursive Reclose Node")
public class RecursiveRecloseNode extends FNCExpressionNode  {


    @Child
    FNCExpressionNode map;
    @Child
    FNCExpressionNode decl;

    public RecursiveRecloseNode(FNCExpressionNode map, FNCExpressionNode decl) {
        this.map = map;
        this.decl = decl;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue m = map.buildAST();
//        return balg.accum(balg.scope(() -> m, decl), lalg.seq(ralg.setForwards(() -> m), balg.environment())).buildAST();
//    }
}
