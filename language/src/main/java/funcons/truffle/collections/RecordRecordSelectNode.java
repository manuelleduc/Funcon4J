package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Record Record Select Node")
public class RecordRecordSelectNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode record;
    @Child
    private FNCExpressionNode field;

    public RecordRecordSelectNode(FNCExpressionNode record, FNCExpressionNode field) {
        super();
        this.record = record;
        this.field = field;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IMap) record.executeGeneric(frame)).get((IValue) field.executeGeneric(frame));
    }
}
