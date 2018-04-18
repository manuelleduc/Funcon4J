package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TrufflePrintFactory extends NullAlg<FNCExecuteNode>, PrintAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode print(FNCExecuteNode x) {
        return new Print(x);
    }

    class Print implements FNCExecuteNode {
        private final FNCExecuteNode x;

        public Print(FNCExecuteNode x) {
            this.x = x;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new PrintPrintNode((FNCExpressionNode) x.buildAST(l), l);
        }
    }
}
