package funcons.truffle.auxiliary;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;

public interface TrufflePrintFactory extends NullAlg<CLExecuteNode>, PrintAlg<CLExecuteNode> {
    @Override
    default CLExecuteNode print(CLExecuteNode x) {
        return new PrintPrintNode(x, this);
    }
}
