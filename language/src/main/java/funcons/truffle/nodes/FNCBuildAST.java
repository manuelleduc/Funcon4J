package funcons.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;

public interface FNCBuildAST extends NodeInterface {
    FNCExpressionNode buildAST(FNCLanguage language) throws funcons.values.signals.RunTimeFunconException;
}
