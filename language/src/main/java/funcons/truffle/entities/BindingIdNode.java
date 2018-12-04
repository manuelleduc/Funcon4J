package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Id Node")
public class BindingIdNode extends FNCExpressionNode {
    private final IString s;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BindingIdNode(String s) {
        this.s =  vf.string(s);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return s;
    }

}
