package funcons.truffle.entities;

import funcons.algebras.entities.AssignAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleAssignFactory extends NullAlg<CLStatementNode>, AssignAlg<CLStatementNode> {

    @Override
    default CLStatementNode assign(CLStatementNode var, CLStatementNode x) {
        /*return (env, given) -> {
            ((Variable)var.eval(env, given)).store(x.eval(env, given));
            return null_().eval(env, given);
        };*/

        return null; // TODO
    }

    @Override
    default CLStatementNode assignedValue(CLStatementNode var) {
//        return (env, given) -> ((Variable)var.eval(env, given)).value();
        return null; // TODO
    }

    @Override
    default CLStatementNode assignedValueIfVar(CLStatementNode v) {
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
    default CLStatementNode alloc(CLStatementNode x) {

//        return (env, given) -> new Variable(x.eval(env, given));
        return null; // TODO
    }
}
