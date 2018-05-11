package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Record Record Node")
public class RecordRecordNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode field;

    @Child
    private FNCExpressionNode val;

    private IValueFactory vf = ValueFactory.getInstance();

    public RecordRecordNode(FNCExpressionNode field, FNCExpressionNode val) {
        super();
        this.field = field;
        this.val = val;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IMapWriter mw = vf.mapWriter();
        mw.put((IValue) field.executeGeneric(frame), (IValue) val.executeGeneric(frame));
        return mw.done();
    }
}
