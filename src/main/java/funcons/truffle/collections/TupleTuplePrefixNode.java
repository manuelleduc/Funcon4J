package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;

public class TupleTuplePrefixNode extends FNCExpressionNode {
    private final FNCExpressionNode x;
    private final FNCExpressionNode tup;

    public TupleTuplePrefixNode(FNCExpressionNode x, FNCExpressionNode tup) {
        this.x = x;
        this.tup = tup;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IList) tup.executeGeneric(frame)).insert((IValue) x.executeGeneric(frame));
    }
}
