package funcons.truffle.values;

import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleNullFactory extends NullAlg<CLStatementNode> {

    @Override
    default CLStatementNode null_() {
//        return (env, given) -> new Null();
        return null; // TODO
    }

    @Override
    default CLStatementNode undefined() {

        // return (env, given) -> new Undefined();
        return null; // TODO
    }
}
