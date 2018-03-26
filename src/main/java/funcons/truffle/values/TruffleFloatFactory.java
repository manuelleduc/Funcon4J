package funcons.truffle.values;

import funcons.algebras.values.FloatAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleFloatFactory extends FloatAlg<CLStatementNode> {

    @Override
    default CLStatementNode lit(Double i) {
//        return (env, given) -> vf.real(i);
        return null; // TODO
    }

    @Override
    default CLStatementNode floatAdd(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.add(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode floatNegate(CLStatementNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).negate().toReal(5);
        return null; // TODO
    }

    @Override
    default CLStatementNode floatSubtract(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode floatMultiply(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.multiply(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode floatDivide(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.divide(bVal, 5).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode floatModulo(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode floatPowerOf(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.toReal(5).pow(bVal.toReal(5), 5);
//        };
        return null; // TODO
    }
}
