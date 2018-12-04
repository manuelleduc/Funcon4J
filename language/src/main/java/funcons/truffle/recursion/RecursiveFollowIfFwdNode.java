package funcons.truffle.recursion;

import com.oracle.truffle.api.CompilerDirectives;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.functions.FunctionAbsNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;

@NodeInfo(description = "Recursive FollowIfFwd Node")
@NodeChild
public abstract class RecursiveFollowIfFwdNode extends FNCExpressionNode {
//    @Child
//    private FNCExpressionNode fwd;

//    public RecursiveFollowIfFwdNode(FNCExpressionNode fwd) {
//        this.fwd = fwd;
//    }

//    @Override
//    public Object recursiveFNCFunction(FNCFunction fncf) {
//        final Object v = fwd.executeGeneric(frame);
//        if (v instanceof FNCFunction) {
//            try {
//                final RootCallTarget callTarget = ((FNCFunction) v).getCallTarget();
//
//                final VirtualFrame virtualFrame = Truffle.getRuntime().createVirtualFrame(
//                        frame.getArguments(), frame.getFrameDescriptor());
//
//                try {
//                    for (FrameSlot s : frame.getFrameDescriptor().getSlots()) {
//                        final Object val = frame.getObject(s);
//                        final FrameSlot s2 = virtualFrame.getFrameDescriptor().findOrAddFrameSlot(s.getIdentifier());
//                        virtualFrame.setObject(s2, val);
//                    }
//                } catch (FrameSlotTypeException e) {
//                    e.printStackTrace();
//                }
//
//
//                return callTarget.getRootNode().execute(virtualFrame);
//            } catch (FNCUndefinedNameException e) {
//                return null;
//            }
//        } else if (v instanceof FunctionAbsNode) {
//            ((FunctionAbsNode) v).executeGeneric(frame);
//        }
//        return v;
//    }

    @Specialization
    public Object recursiveFNCFunction(VirtualFrame frame, FNCFunction v) {

        final RootCallTarget callTarget = ((FNCFunction) v).getCallTarget();

        final VirtualFrame virtualFrame = Truffle.getRuntime().createVirtualFrame(
                frame.getArguments(), frame.getFrameDescriptor());

        try {
            final FrameSlot[] slots = getFrameSlots(frame.getFrameDescriptor());
            for (FrameSlot s : slots) {
                final Object val = frame.getObject(s);
                FrameDescriptor frameDescriptor = virtualFrame.getFrameDescriptor();
                final FrameSlot s2 = getFrameSlot(s, frameDescriptor);
                virtualFrame.setObject(s2, val);
            }
        } catch (FrameSlotTypeException e) {
            e.printStackTrace();
        }


        return callTarget.getRootNode().execute(virtualFrame);

    }

    @CompilerDirectives.TruffleBoundary
    private FrameSlot getFrameSlot(FrameSlot s, FrameDescriptor frameDescriptor) {
        return frameDescriptor.findOrAddFrameSlot(s.getIdentifier());
    }

    @CompilerDirectives.TruffleBoundary
    private FrameSlot[] getFrameSlots(FrameDescriptor frameDescriptor) {
        return frameDescriptor.getSlots().toArray(new FrameSlot[0]);
    }

    @Specialization
    public Object recursiveFunctionAbsNode(VirtualFrame frame, FunctionAbsNode v) {
        return v.executeGeneric(frame);
    }

    @Specialization
    public Object recursiveObject(Object v) {
        return v;
    }

}
