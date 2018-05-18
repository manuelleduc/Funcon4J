package funcons.truffle.entities;

import funcons.algebras.entities.SupplyGivenAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode given() {
        return new Given();
    }

    @Override
    default FNCExecuteNode supply(FNCExecuteNode exp, FNCExecuteNode x) {
        return new Supply(exp, x);
    }

    class Given implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new SupplyGivenGivenNode();
        }
    }

    class Supply implements FNCExecuteNode {
        private final FNCExecuteNode exp;
        private final FNCExecuteNode x;

        public Supply(FNCExecuteNode exp, FNCExecuteNode x) {
            this.exp = exp;
            this.x = x;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new SupplyGivenSupplyNode(exp.buildAST(l), x.buildAST(l));
        }
    }
}
