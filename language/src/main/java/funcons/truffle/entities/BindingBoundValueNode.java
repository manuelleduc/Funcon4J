package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode id;

    public BindingBoundValueNode(FNCExpressionNode id) {
        this.id = id;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {

//        IMapWriter mw = vf.mapWriter();
//
//        IValue eval = id.eval(env, given);
//        IValue eval1 = exp.eval(env, given);
//        mw.put(eval, eval1);
//        return mw.done();

        final Object functionName = id.executeGeneric(frame);

        try {
            final FrameDescriptor frameDescriptor = frame.getFrameDescriptor();
            final FrameSlot frameSlot = frameDescriptor.findFrameSlot(functionName);
            if (frameSlot == null)
                return null;
            return frame.getObject(frameSlot);
        } catch (FrameSlotTypeException e) {
            throw new RuntimeException("Identifier " + functionName + " not found", e);
        }
    }
}
