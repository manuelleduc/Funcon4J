package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TrufflePrintFactory extends NullAlg<FNCExecuteNode>, PrintAlg<FNCExecuteNode> {
    @Override
    default FNCExecuteNode print(FNCExecuteNode x) {
        return l -> new PrintPrintNode((FNCExpressionNode) x.buildAST(l));
    }
}
