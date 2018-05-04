package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IString;

@NodeInfo(description = "String String Append Node")
public class StringStringAppendNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode str1;

    @Child
    private FNCExpressionNode str2;

    public StringStringAppendNode(FNCExpressionNode str1, FNCExpressionNode str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IString s1 = (IString) str1.executeGeneric(frame);
        final IString s2 = (IString) str2.executeGeneric(frame);
        return s1.concat(s2);
    }
}
