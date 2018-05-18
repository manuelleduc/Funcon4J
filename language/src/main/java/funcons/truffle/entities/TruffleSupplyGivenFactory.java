package funcons.truffle.entities;

import funcons.algebras.entities.SupplyGivenAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST given() {
        return new Given();
    }

    @Override
    default FNCBuildAST supply(FNCBuildAST exp, FNCBuildAST x) {
        return new Supply(exp, x);
    }

    class Given implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new SupplyGivenGivenNode();
        }
    }

    class Supply implements FNCBuildAST {
        private final FNCBuildAST exp;
        private final FNCBuildAST x;

        public Supply(FNCBuildAST exp, FNCBuildAST x) {
            this.exp = exp;
            this.x = x;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new SupplyGivenSupplyNode(exp.buildAST(l), x.buildAST(l));
        }
    }
}
