package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.sun.org.apache.regexp.internal.RE;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public class TupleTuplePrefixMatchNode extends FNCExpressionNode {
    private final FNCExpressionNode p1;
    private final FNCExpressionNode p2;

    public TupleTuplePrefixMatchNode(FNCExpressionNode p1, FNCExpressionNode p2) {
        super();
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("not implemented");
    }

}
