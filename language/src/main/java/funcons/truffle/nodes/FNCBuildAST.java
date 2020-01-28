package funcons.truffle.nodes;

public interface FNCBuildAST  {
    FNCExpressionNode buildAST(FNCLanguage language) throws funcons.values.signals.RunTimeFunconException;
}
