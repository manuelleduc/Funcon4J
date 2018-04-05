package camllight.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;
import funcons.values.signals.FunconException;

public interface CLExecuteNode extends NodeInterface {
    default CLExecuteNode buildAST() throws FunconException {
        System.out.println(toString());
        return this;
    }
}
