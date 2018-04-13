package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "String String Node")
public class StringStringNode extends FNCExpressionNode {

    IValueFactory vf = ValueFactory.getInstance();
    private final String s;

    public StringStringNode(String s) {
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
