package funcons.truffle.nodes;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(language = "CL", description = "CamlLight Root Node")
public class FNCRootNode extends RootNode {

    @Child
    private FNCExpressionNode child;

    public FNCRootNode(TruffleLanguage<?> language, FNCExpressionNode child) {
        super(language);
        this.child = child;
    }

    public FNCRootNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor, FNCExpressionNode child) {
        super(language, frameDescriptor);
        this.child = child;
    }

    @Override
    public Object execute(VirtualFrame frame) {
            return this.child.executeGeneric(frame);
    }

}
