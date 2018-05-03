package funcons.truffle.entities;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.NodeField;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.*;


@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends FNCExpressionNode {

    private final FNCExpressionNode localBinding;
    private final FNCExpressionNode exp;
    private final FNCLanguage l;

    public BindingScopeNode(FNCExpressionNode localBinding, FNCExpressionNode exp, FNCLanguage l) {
        this.localBinding = localBinding;
        this.exp = exp;
        this.l = l;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        this.localBinding.executeGeneric(frame);
        return exp.executeGeneric(frame);
    }


}
