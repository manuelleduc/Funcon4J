package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


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
        this.letDefinition.executeGeneric(frame);
        return expr.executeGeneric(frame);
    }


}
