package funcons.truffle.values;

import funcons.algebras.values.NullAlg;
import funcons.truffle.entities.BindingBindValueNode;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleNullFactory extends NullAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode null_() {
        return new Null_();
    }

    @Override
    default FNCExecuteNode undefined() {

        // return (env, given) -> new Undefined();
        return new Undefined();
    }

    class Null_ implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new NullNullNode();
        }
    }

    class Undefined implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new NullUndefinedNode();
        }
    }
}
