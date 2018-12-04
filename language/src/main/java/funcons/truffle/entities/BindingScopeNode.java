package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

import java.util.Map;


/**
 * https://plancomps.github.io/CBS-beta/Languages-beta/OCaml-Light/OC-L-cbs/OC-L/OC-L-07-Expressions/index.html
 * <p>
 * let-definition 'in' expr
 */
@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends FNCExpressionNode {


    /**
     * let-definition
     */
    @Child
    private FNCExpressionNode letDefinition;

    /**
     * expr
     */
    @Child
    private FNCExpressionNode expr;

    public BindingScopeNode(final FNCExpressionNode letDefinition, final FNCExpressionNode expr) {
        this.letDefinition = letDefinition;
        this.expr = expr;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        System.err.println("Binding " + letDefinition + " --- " + expr);
        Map<String, Object> map = this.letDefinition.defineValues();
//        frame.getFrameDescriptor().
        map.entrySet().forEach(es -> {
            final FrameSlot frameSlot = frame.getFrameDescriptor().findOrAddFrameSlot(es.getKey());
            frame.setObject(frameSlot, es.getValue());
        });
        return expr.executeGeneric(frame);
    }


}
