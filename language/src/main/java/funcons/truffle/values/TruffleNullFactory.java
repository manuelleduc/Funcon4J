package funcons.truffle.values;

import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleNullFactory extends NullAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST null_() {
        return new Null_();
    }

    @Override
    default FNCBuildAST undefined() {
        return new Undefined();
    }

    class Null_ implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new NullNullNode();
        }
    }

    class Undefined implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new NullUndefinedNode();
        }
    }
}
