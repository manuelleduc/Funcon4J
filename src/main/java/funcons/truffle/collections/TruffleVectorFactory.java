package funcons.truffle.collections;

import funcons.algebras.collections.VectorAlg;
import funcons.algebras.entities.AssignAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleVectorFactory  extends AssignAlg<CLStatementNode>, VectorAlg<CLStatementNode> {

    @Override
    default CLStatementNode vector() {
//        return (env, given) -> vf.list();
        return null; // TODO
    }

    @Override
    default CLStatementNode vector(CLStatementNode val) {
//        return (env, given) -> vf.list((IValue)alloc(val).eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode vectorSelect(CLStatementNode vector, CLStatementNode index) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assignedValue((e,g)->var).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode vectorAppend(CLStatementNode vector1, CLStatementNode vector2) {
//        return (env, given) -> {
//            IList vector1Val = (IList)vector1.eval(env, given);
//            IList vector2Val = (IList)vector2.eval(env, given);
//            return vector1Val.concat(vector2Val);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode vectorLength(CLStatementNode vector) {
//        return (env, given) ->
//                vf.integer(((IList)vector.eval(env, given)).length());
        return null; // TODO
    }

    @Override
    default CLStatementNode vectorAssign(CLStatementNode vector, CLStatementNode index, CLStatementNode val) {
//        return (env, given) -> {
//            IList vectorVal = (IList)vector.eval(env, given);
//            IValue var = vectorVal.get(((IInteger)index.eval(env, given)).intValue());
//            return assign((e,g)->var, val).eval(env, given);
//        };
        return null; // TODO
    }
}