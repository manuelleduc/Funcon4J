package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public class TupleTupleNode0 extends FNCExpressionNode {

    ValueFactory vf = ValueFactory.getInstance();
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.tuple();
    }
}
