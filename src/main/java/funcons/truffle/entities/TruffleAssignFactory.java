package funcons.truffle.entities;

import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleAssignFactory extends NullAlg<FNCExecuteNode>, AssignAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode assign(final FNCExecuteNode var, final FNCExecuteNode x) {
        return l -> new AssignAssignNode((FNCExpressionNode) var.buildAST(l), (FNCExpressionNode) x.buildAST(l));
    }

    @Override
    default FNCExecuteNode assignedValue(FNCExecuteNode var) {
        return l -> new AssignAssignedValueNode((FNCExpressionNode) var.buildAST(l));
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
        return (l) -> new AssignAllocNode((FNCExpressionNode) x.buildAST(l));
    }
}
