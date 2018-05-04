package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.helper.RascalCLStringFactory;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "String CamlLightChar Node")
public class StringCamlLightCharNode extends FNCExpressionNode {
    private final String s;

    public StringCamlLightCharNode(String s) {
        this.s = s;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return RascalCLStringFactory.clChar(ValueFactory.getInstance(), s);
    }
}
