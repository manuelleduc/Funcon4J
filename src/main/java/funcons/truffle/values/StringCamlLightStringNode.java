package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.helper.RascalCLStringFactory;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "String CamlLightString Node")
public class StringCamlLightStringNode extends FNCExpressionNode {
    private final String s;

    private final IValueFactory vf = ValueFactory.getInstance();

    public StringCamlLightStringNode(String s) {
        this.s = s;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return RascalCLStringFactory.clString(vf, s);
    }
}
