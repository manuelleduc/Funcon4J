package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMap;

@NodeInfo(description = "Record RecordUnion Node")
public class RecordRecordUnionNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode rec1;

    @Child
    private FNCExpressionNode rec2;

    public RecordRecordUnionNode(FNCExpressionNode rec1, FNCExpressionNode rec2) {
        super();
        this.rec1 = rec1;
        this.rec2 = rec2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IMap) rec1.executeGeneric(frame))
                .join((IMap) rec2.executeGeneric(frame));
    }
}
