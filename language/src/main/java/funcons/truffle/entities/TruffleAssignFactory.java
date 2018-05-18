package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.Variable;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;

public interface TruffleAssignFactory extends NullAlg<FNCExecuteNode>, AssignAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode assign(final FNCExecuteNode var, final FNCExecuteNode x) {
        return l -> {
            FNCExpressionNode vare = var.buildAST(l);
            FNCExpressionNode nulle = null_().buildAST(l);
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return nulle.executeGeneric(frame);
                }
            };
        };
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


        return l -> {
            final FNCExpressionNode ve = v.buildAST(l);
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {

                    final IValue val = (IValue) ve.executeGeneric(frame);
                    if (val instanceof Variable) {
                        return ((Variable) val).value();
                    }
                    return val;
                }

            };
        };

    }

    @Override
    default FNCExecuteNode alloc(FNCExecuteNode x) {
        return l -> {
            FNCExpressionNode xe = x.buildAST(l);
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return new Variable((IValue) xe.executeGeneric(frame));
                }
            };
        };
    }

    class Assign implements FNCExecuteNode {
        private final FNCExecuteNode var;
        private final FNCExecuteNode x;

        public Assign(FNCExecuteNode var, FNCExecuteNode x) {
            this.var = var;
            this.x = x;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new AssignAssignNode(var.buildAST(l), x.buildAST(l));
        }
    }

    class AssignedValue implements FNCExecuteNode {
        private final FNCExecuteNode var;

        public AssignedValue(FNCExecuteNode var) {
            this.var = var;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new AssignAssignedValueNode(var.buildAST(l));
        }
    }
}
