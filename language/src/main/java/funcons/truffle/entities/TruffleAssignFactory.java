package funcons.truffle.entities;

import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleAssignFactory extends NullAlg<FNCExecuteNode>, AssignAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode assign(final FNCExecuteNode var, final FNCExecuteNode x) {
        return new Assign(var, x);
    }

    @Override
    default FNCExecuteNode assignedValue(FNCExecuteNode var) {
        return new AssignedValue(var);
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

    class Assign implements FNCExecuteNode {
        private final FNCExecuteNode var;
        private final FNCExecuteNode x;

        public Assign(FNCExecuteNode var, FNCExecuteNode x) {
            this.var = var;
            this.x = x;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new AssignAssignNode((FNCExpressionNode) var.buildAST(l), (FNCExpressionNode) x.buildAST(l));
        }
    }

    class AssignedValue implements FNCExecuteNode {
        private final FNCExecuteNode var;

        public AssignedValue(FNCExecuteNode var) {
            this.var = var;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new AssignAssignedValueNode((FNCExpressionNode) var.buildAST(l));
        }
    }
}
