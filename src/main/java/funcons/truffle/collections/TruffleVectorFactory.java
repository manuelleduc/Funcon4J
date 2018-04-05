package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;

public interface TruffleVectorFactory extends AssignAlg<CLExecuteNode>, VectorAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode vector() {
        return new VectorVectorNode();
    }

    @Override
    default CLExecuteNode vector(CLExecuteNode val) {
        return new VectorVectorNode2(val, this);
    }

    @Override
    default CLExecuteNode vectorSelect(CLExecuteNode vector, CLExecuteNode index) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assignedValue((e,g)->var).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode vectorAppend(CLExecuteNode vector1, CLExecuteNode vector2) {
        return new VectorVectorAppendNode(vector1, vector2);
    }

    @Override
    default CLExecuteNode vectorLength(CLExecuteNode vector) {
        return new VectorVectorLengthNode(vector);
    }

    @Override
    default CLExecuteNode vectorAssign(CLExecuteNode vector, CLExecuteNode index, CLExecuteNode val) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assign((e,g)->var, val).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }
}