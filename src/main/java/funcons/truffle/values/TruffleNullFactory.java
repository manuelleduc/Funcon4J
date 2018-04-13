package funcons.truffle.values;

import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;

public interface TruffleNullFactory extends NullAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode null_() {
        return l -> new NullNullNode();
    }

    @Override
    default FNCExecuteNode undefined() {

        // return (env, given) -> new Undefined();
        return l -> new NullUndefinedNode();
    }
}
