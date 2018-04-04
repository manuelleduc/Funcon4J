package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.values.NullAlg;

public interface TruffleNullFactory extends NullAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode null_() {
        return new NullNullNode();
    }

    @Override
    default CLExecuteNode undefined() {

        // return (env, given) -> new Undefined();
        return null; // TODO
    }
}
