package funcons.truffle.entities;

import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleAssignFactory extends NullAlg<FNCExecuteNode>, AssignAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode assign(FNCExecuteNode var, FNCExecuteNode x) {
        return new AssignAssignNode((FNCExpressionNode) var, (FNCExpressionNode) x);
    }

    @Override
    default FNCExecuteNode assignedValue(FNCExecuteNode var) {
        return new AssignAssignedValueNode((FNCExpressionNode) var);
    }

    @Override
    default FNCExecuteNode assignedValueIfVar(FNCExecuteNode v) {
//        return (env, given) -> {
//            IValue val = v.eval(env, given);
//            if (val instanceof Variable) {
//                return ((Variable)val).value();
//            }
//            return val;
//        };
        throw new RuntimeException("Not implemented");

    }

    @Override
    default FNCExecuteNode alloc(FNCExecuteNode x) {
        return new AssignAllocNode((FNCExpressionNode) x);
    }
}
