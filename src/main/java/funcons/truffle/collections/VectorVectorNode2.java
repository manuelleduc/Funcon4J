package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vectore Node 2")
public class VectorVectorNode2 extends FNCExpressionNode  {

    ValueFactory vf = ValueFactory.getInstance();

    @Child
    FNCExpressionNode val;

    public VectorVectorNode2(FNCExpressionNode val) {
        this.val = val;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list((IValue) aalg.alloc(val).buildAST());
//    }
}
