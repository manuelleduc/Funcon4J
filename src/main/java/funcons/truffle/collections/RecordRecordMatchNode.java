package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Record Record Mach Node")
public class RecordRecordMatchNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode rec;

    @Child
    private FNCExpressionNode pattMap;

    public RecordRecordMatchNode(FNCExpressionNode rec, FNCExpressionNode pattMap) {
        super();
        this.rec = rec;
        this.pattMap = pattMap;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("not implemented");
    }
}
