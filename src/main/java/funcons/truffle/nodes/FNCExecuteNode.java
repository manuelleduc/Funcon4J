package funcons.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;

public interface FNCExecuteNode extends NodeInterface {
    FNCStatementNode buildAST(FNCLanguage language);
}
