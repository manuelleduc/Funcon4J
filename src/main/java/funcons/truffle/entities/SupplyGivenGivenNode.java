package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Supply Given Given Node")
public class SupplyGivenGivenNode extends FNCExpressionNode  {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot("given");
        try {
            return frame.getObject(given);
        } catch (FrameSlotTypeException e) {
            throw new RuntimeException("Given not found", e);

        }
    }
}
