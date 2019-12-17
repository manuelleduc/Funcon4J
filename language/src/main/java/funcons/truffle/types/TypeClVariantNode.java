package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.cl.CLVariant;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Type CLVariant Node")
public class TypeClVariantNode extends FNCExpressionNode {
    private final String tagName;
    @Child
    private FNCExpressionNode exp;

    private IValueFactory vf = ValueFactory.getInstance();

    public TypeClVariantNode(String tagName, FNCExpressionNode exp) {
        super();
        this.tagName = tagName;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new CLVariant(vf.string(tagName), (IValue) exp.executeGeneric(frame));
    }
}
