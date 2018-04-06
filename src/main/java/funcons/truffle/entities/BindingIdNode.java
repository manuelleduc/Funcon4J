package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Id Node")
public class BindingIdNode extends FNCExpressionNode implements FNCExecuteNode {
    private final String s;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingIdNode(String s) {
        this.s = s;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.string(s);
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.string(s);
//    }
}
