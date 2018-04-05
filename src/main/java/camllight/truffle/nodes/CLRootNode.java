package camllight.truffle.nodes;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.RootNode;
import funcons.values.Null;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(language = "CL", description = "CamlLight Root Node")
public class CLRootNode extends RootNode implements CLExecuteNode {

    @Child
    private CLExecuteNode child;

    public CLRootNode(TruffleLanguage<?> language, CLExecuteNode child) {
        super(language);
        this.child = child;
    }

    public CLRootNode(TruffleLanguage<?> language, FrameDescriptor frameDescriptor, CLExecuteNode child) {
        super(language, frameDescriptor);
        this.child = child;
    }

    @Override
    public Object execute(VirtualFrame frame) {
        // TODO
        return null; //child.executeGeneric(frame);
    }

    @Override
    public IValue buildAST(IMap env, IValue aNull) {
        // TODO ?
        return null;
    }
}
