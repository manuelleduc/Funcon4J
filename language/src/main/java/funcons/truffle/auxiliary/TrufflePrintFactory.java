package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TrufflePrintFactory extends NullAlg<FNCBuildAST>, PrintAlg<FNCBuildAST> {
    @Override
    default FNCBuildAST print(FNCBuildAST x) {
        return new Print(x);
    }

    class Print implements FNCBuildAST {
        private final FNCBuildAST x;

        public Print(FNCBuildAST x) {
            this.x = x;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new PrintPrintNode(x.buildAST(l), l);
        }
    }
}
