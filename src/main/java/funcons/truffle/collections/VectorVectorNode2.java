package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vectore Node 2")
public class VectorVectorNode2 extends FNCExpressionNode {

    ValueFactory vf = ValueFactory.getInstance();

    @Child
    FNCExpressionNode alloc;

    public VectorVectorNode2(FNCExpressionNode alloc) {
        this.alloc = alloc;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.list((IValue) alloc.executeGeneric(frame));
    }
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list((IValue) aalg.alloc(val).buildAST());
//    }
}
