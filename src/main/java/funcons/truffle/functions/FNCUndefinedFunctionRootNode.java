package funcons.truffle.functions;

import funcons.truffle.nodes.FNCLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.RootNode;

public class FNCUndefinedFunctionRootNode extends RootNode {
    public FNCUndefinedFunctionRootNode(FNCLanguage language, String name) {
        super(language, null);
    }

    @Override
    public Object execute(VirtualFrame frame) {
        throw FNCUndefinedNameException.undefinedFunction(getName());
    }
}
