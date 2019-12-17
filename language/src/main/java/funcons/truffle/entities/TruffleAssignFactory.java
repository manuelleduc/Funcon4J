package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.Variable;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;

public interface TruffleAssignFactory extends NullAlg<FNCBuildAST>, AssignAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST assign(final FNCBuildAST var, final FNCBuildAST x) {
        return l -> {

            final FNCExpressionNode ne = null_().buildAST(l);
            final FNCExpressionNode vare = var.buildAST(l);
            final FNCExpressionNode xe = x.buildAST(l);

            return new AssignAssignNode2(vare, xe, ne);
        };
    }

    @Override
    default FNCBuildAST assignedValue(FNCBuildAST var) {
        return new AssignedValue(var);
    }

    @Override
    default FNCBuildAST assignedValueIfVar(FNCBuildAST v) {
        return l -> {
            final FNCExpressionNode ve = v.buildAST(l);
            return new AssignAssignedValueIfVarNode(ve);
        };

    }

    @Override
    default FNCBuildAST alloc(FNCBuildAST x) {
        return l -> {
            final FNCExpressionNode xe = x.buildAST(l);
            return new AssignAllocNode(xe);
        };
    }

    class AssignedValue implements FNCBuildAST {
        private final FNCBuildAST var;

        public AssignedValue(FNCBuildAST var) {
            this.var = var;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new AssignAssignedValueNode(var.buildAST(l));
        }
    }

    @NodeInfo(description = "Assign Assign Node2")
    class AssignAssignNode2 extends FNCExpressionNode {

        @Child
        private FNCExpressionNode vare;

        @Child
        private FNCExpressionNode xe;

        @Child
        private FNCExpressionNode ne;

        public AssignAssignNode2(FNCExpressionNode vare, FNCExpressionNode xe, FNCExpressionNode ne) {
            this.vare = vare;
            this.xe = xe;
            this.ne = ne;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            ((Variable) vare.executeGeneric(frame)).store((IValue) xe.executeGeneric(frame));
            return ne.executeGeneric(frame);
        }
    }

    @NodeInfo(description = "Assign Alloc Node")
    class AssignAllocNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode xe;

        public AssignAllocNode(FNCExpressionNode xe) {
            this.xe = xe;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return new Variable((IValue) xe.executeGeneric(frame));
        }
    }

    @NodeInfo(description = "Assign AssignedValieIfVar Node")
    class AssignAssignedValueIfVarNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode ve;

        public AssignAssignedValueIfVarNode(FNCExpressionNode ve) {
            this.ve = ve;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {

            final IValue val = (IValue) ve.executeGeneric(frame);
            if (val instanceof Variable) {
                return ((Variable) val).value();
            }
            return val;
        }

    }
}
