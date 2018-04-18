package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "List ListLength Node")
public class ListListLengthNode extends FNCExpressionNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Child
    FNCExpressionNode list;

    public ListListLengthNode(FNCExpressionNode list) {
        this.list = list;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.integer(((IList) list.executeGeneric(frame)).length());
    }
}
