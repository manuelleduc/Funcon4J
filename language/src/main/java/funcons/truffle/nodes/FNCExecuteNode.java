package funcons.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;
import funcons.truffle.entities.BindingBindValueNode;

public interface FNCExecuteNode extends NodeInterface {
    FNCStatementNode buildAST(FNCLanguage language) throws funcons.values.signals.RunTimeFunconException;
}
