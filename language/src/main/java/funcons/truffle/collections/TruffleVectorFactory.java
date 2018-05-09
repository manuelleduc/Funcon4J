package funcons.truffle.collections;

import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleVectorFactory extends AssignAlg<FNCExecuteNode>, VectorAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode vector() {
        return new Vector();
    }

    @Override
    default FNCExecuteNode vector(FNCExecuteNode val) {
        return new Vector2(val, this);
    }

    @Override
    default FNCExecuteNode vectorSelect(FNCExecuteNode vector, FNCExecuteNode index) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assignedValue((e,g)->var).eval(env, given);
//        };
        return new VectorSelect(vector, index, this);
    }

    @Override
    default FNCExecuteNode vectorAppend(FNCExecuteNode vector1, FNCExecuteNode vector2) {
        return new VectorAppend(vector1, vector2);
    }

    @Override
    default FNCExecuteNode vectorLength(FNCExecuteNode vector) {
        return new VectorLength(vector);
    }

    @Override
    default FNCExecuteNode vectorAssign(FNCExecuteNode vector, FNCExecuteNode index, FNCExecuteNode val) {
        return new VectorAssign(vector, index, val, this);
    }

    class Vector implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorNode();
        }
    }

    class VectorAppend implements FNCExecuteNode {
        private final FNCExecuteNode vector1;
        private final FNCExecuteNode vector2;

        public VectorAppend(FNCExecuteNode vector1, FNCExecuteNode vector2) {
            this.vector1 = vector1;
            this.vector2 = vector2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorAppendNode((FNCExpressionNode) vector1.buildAST(l), (FNCExpressionNode) vector2.buildAST(l));
        }
    }

    class Vector2 implements FNCExecuteNode {
        private final FNCExecuteNode val;
        private final TruffleVectorFactory alg;

        public Vector2(FNCExecuteNode val, TruffleVectorFactory alg) {
            this.val = val;
            this.alg = alg;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorNode2((FNCExpressionNode) alg.alloc(val).buildAST(l));
        }
    }

    class VectorLength implements FNCExecuteNode {
        private final FNCExecuteNode vector;

        public VectorLength(FNCExecuteNode vector) {
            this.vector = vector;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new VectorVectorLengthNode((FNCExpressionNode) vector.buildAST(l));
        }
    }

    class VectorAssign implements FNCExecuteNode {
        private final FNCExecuteNode vector;
        private final FNCExecuteNode index;
        private final FNCExecuteNode val;
        private final TruffleVectorFactory alg;

        public VectorAssign(FNCExecuteNode vector, FNCExecuteNode index, FNCExecuteNode val, TruffleVectorFactory alg) {
            this.vector = vector;
            this.index = index;
            this.val = val;
            this.alg = alg;
        }


        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            //        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assign((e,g)->var, val).eval(env, given);
//        };


            final FNCExecuteNode vectorVectorAssignNode = z -> new VectorVectorAssignNode((FNCExpressionNode) vector.buildAST(z), (FNCExpressionNode) index.buildAST(z));
            return alg.assign(vectorVectorAssignNode, val).buildAST(l);
        }
    }

    class VectorSelect implements FNCExecuteNode {
        private final FNCExecuteNode vector;
        private final FNCExecuteNode index;
        private final TruffleVectorFactory alg;

        public VectorSelect(FNCExecuteNode vector, FNCExecuteNode index, TruffleVectorFactory alg) {
            this.vector = vector;
            this.index = index;
            this.alg = alg;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return alg.assignedValue(z -> new VectorVectorSelectNode((FNCExpressionNode) vector.buildAST(z), (FNCExpressionNode) index.buildAST(z))).buildAST(l);
        }

        //        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assignedValue((e,g)->var).eval(env, given);
//        };
    }
}