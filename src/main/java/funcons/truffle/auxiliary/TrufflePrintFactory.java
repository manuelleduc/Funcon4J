package funcons.truffle.auxiliary;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;

public interface TrufflePrintFactory extends NullAlg<FNCExecuteNode>, PrintAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode print(FNCExecuteNode x) {
        return new PrintPrintNode((FNCExpressionNode) x);
    }
}
