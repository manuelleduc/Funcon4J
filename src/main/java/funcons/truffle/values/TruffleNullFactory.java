package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.values.NullAlg;

public interface TruffleNullFactory extends NullAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode null_() {
        return new NullNullNode();
    }

    @Override
    default FNCExecuteNode undefined() {

        // return (env, given) -> new Undefined();
        return new NullUndefinedNode();
    }
}
