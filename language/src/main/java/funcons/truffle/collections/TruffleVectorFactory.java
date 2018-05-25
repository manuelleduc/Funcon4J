package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;

public interface TruffleVectorFactory extends AssignAlg<FNCBuildAST>, VectorAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST vector() {
        return new Vector();
    }

    @Override
    default FNCBuildAST vector(FNCBuildAST val) {
        return new Vector2(val, this);
    }

    @Override
    default FNCBuildAST vectorSelect(FNCBuildAST vector, FNCBuildAST index) {
        return new VectorSelect(vector, index, this);
    }

    @Override
    default FNCBuildAST vectorAppend(FNCBuildAST vector1, FNCBuildAST vector2) {
        return new VectorAppend(vector1, vector2);
    }

    @Override
    default FNCBuildAST vectorLength(FNCBuildAST vector) {
        return new VectorLength(vector);
    }

    @Override
    default FNCBuildAST vectorAssign(FNCBuildAST vector, FNCBuildAST index, FNCBuildAST val) {
        return l -> {
            final FNCExpressionNode ve = vector.buildAST(l);
            final FNCExpressionNode ie = index.buildAST(l);
            VectorVectorAssignNode vectorVectorAssignNode = new VectorVectorAssignNode(ve, ie);
            final FNCBuildAST var = language -> {
                return vectorVectorAssignNode;
            };
            return assign(var, val).buildAST(l);
        };
    }

    class Vector implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorNode();
        }
    }

    class VectorAppend implements FNCBuildAST {
        private final FNCBuildAST vector1;
        private final FNCBuildAST vector2;

        public VectorAppend(FNCBuildAST vector1, FNCBuildAST vector2) {
            this.vector1 = vector1;
            this.vector2 = vector2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorAppendNode(vector1.buildAST(l), vector2.buildAST(l));
        }
    }

    class Vector2 implements FNCBuildAST {
        private final FNCBuildAST val;
        private final TruffleVectorFactory alg;

        public Vector2(FNCBuildAST val, TruffleVectorFactory alg) {
            this.val = val;
            this.alg = alg;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorNode2(alg.alloc(val).buildAST(l));
        }
    }

    class VectorLength implements FNCBuildAST {
        private final FNCBuildAST vector;

        public VectorLength(FNCBuildAST vector) {
            this.vector = vector;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorLengthNode(vector.buildAST(l));
        }
    }

    class VectorSelect implements FNCBuildAST {
        private final FNCBuildAST vector;
        private final FNCBuildAST index;
        private final TruffleVectorFactory alg;

        public VectorSelect(FNCBuildAST vector, FNCBuildAST index, TruffleVectorFactory alg) {
            this.vector = vector;
            this.index = index;
            this.alg = alg;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return alg.assignedValue(z -> new VectorVectorSelectNode(vector.buildAST(z), index.buildAST(z))).buildAST(l);
        }
    }

    @NodeInfo(description = "Vector VectorAssign Node")
    class VectorVectorAssignNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode ve;

        @Child
        private FNCExpressionNode ie;

        public VectorVectorAssignNode(FNCExpressionNode ve, FNCExpressionNode ie) {
            this.ve = ve;
            this.ie = ie;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IList vectorVal = (IList) ve.executeGeneric(frame);
            try {
                return vectorVal.get(ie.executeIInteger(frame).intValue());
            } catch (UnexpectedResultException e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}