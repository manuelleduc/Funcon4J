package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleVectorFactory extends AssignAlg<FNCExecuteNode>, VectorAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode vector() {
        return new VectorVectorNode();
    }

    @Override
    default FNCExecuteNode vector(FNCExecuteNode val) {
        return new VectorVectorNode2((FNCExpressionNode) val);
    }

    @Override
    default FNCExecuteNode vectorSelect(FNCExecuteNode vector, FNCExecuteNode index) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assignedValue((e,g)->var).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode vectorAppend(FNCExecuteNode vector1, FNCExecuteNode vector2) {
        return new VectorVectorAppendNode((FNCExpressionNode) vector1, (FNCExpressionNode) vector2);
    }

    @Override
    default FNCExecuteNode vectorLength(FNCExecuteNode vector) {
        return new VectorVectorLengthNode((FNCExpressionNode) vector);
    }

    @Override
    default FNCExecuteNode vectorAssign(FNCExecuteNode vector, FNCExecuteNode index, FNCExecuteNode val) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assign((e,g)->var, val).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }
}