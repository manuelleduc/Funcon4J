package funcons.truffle.nodes;

import com.oracle.truffle.api.nodes.NodeInterface;

public interface FNCBuildAST  {
    FNCExpressionNode buildAST(FNCLanguage language) throws funcons.values.signals.RunTimeFunconException;
}
