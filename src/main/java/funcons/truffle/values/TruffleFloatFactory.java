package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.values.FloatAlg;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleFloatFactory extends FloatAlg<FNCExecuteNode> {


    public static final ValueFactory vf = ValueFactory.getInstance();
    @Override
    default FNCExecuteNode lit(Double i) {
//        return (env, given) -> vf.real(i);
        return new FNCExecuteNode() {
            @Override
            public FNCStatementNode buildAST(FNCLanguage language) throws RunTimeFunconException {
                return new FloatLitNode(i);
            }
        };
    }

    @Override
    default FNCExecuteNode floatAdd(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.add(bVal).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatNegate(FNCExecuteNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).negate().toReal(5);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatSubtract(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(bVal).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatMultiply(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.multiply(bVal).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatDivide(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.divide(bVal, 5).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatModulo(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode floatPowerOf(FNCExecuteNode a, FNCExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.toReal(5).pow(bVal.toReal(5), 5);
//        };
        throw new RuntimeException("Not implemented");
    }
}
