package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleAssignFactory extends NullAlg<FNCExecuteNode>, AssignAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode assign(FNCExecuteNode var, FNCExecuteNode x) {
        return new AssignAssignNode(var, x, this);
    }

    @Override
    default FNCExecuteNode assignedValue(FNCExecuteNode var) {
        return new AssignAssignedValueNode(var);
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
        return new AssignAllocNode(x);
    }
}
