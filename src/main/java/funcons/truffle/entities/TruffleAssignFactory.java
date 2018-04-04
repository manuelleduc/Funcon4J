package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleAssignFactory extends NullAlg<CLExecuteNode>, AssignAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode assign(CLExecuteNode var, CLExecuteNode x) {
        /*return (env, given) -> {
            ((Variable)var.eval(env, given)).store(x.eval(env, given));
            return null_().eval(env, given);
        };*/

        return null; // TODO
    }

    @Override
    default CLExecuteNode assignedValue(CLExecuteNode var) {
//        return (env, given) -> ((Variable)var.eval(env, given)).value();
        return null; // TODO
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
        return null; // TODO

    }

    @Override
    default CLExecuteNode alloc(CLExecuteNode x) {
        return new AssignAllocNode(x);
    }
}
