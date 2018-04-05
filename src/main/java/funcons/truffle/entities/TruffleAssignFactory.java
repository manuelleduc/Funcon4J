package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleAssignFactory extends NullAlg<CLExecuteNode>, AssignAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode assign(CLExecuteNode var, CLExecuteNode x) {
        return new AssignAssignNode(var, x, this);
    }

    @Override
    default CLExecuteNode assignedValue(CLExecuteNode var) {
        return new AssignAssignedValueNode(var);
    }

    @Override
    default CLExecuteNode assignedValueIfVar(CLExecuteNode v) {
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
    default CLExecuteNode alloc(CLExecuteNode x) {
        return new AssignAllocNode(x);
    }
}
