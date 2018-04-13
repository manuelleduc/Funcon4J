package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.truffle.nodes.FNCExpressionNode;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode given() {
//        return (env, given) -> given;
        return l ->  new SupplyGivenGivenNode(); // TODO
    }

    @Override
    default FNCExecuteNode supply(FNCExecuteNode exp, FNCExecuteNode x) {
//        return (env, given) -> x.eval(env, exp.eval(env, given));
        return l -> new SupplyGivenSupplyNode((FNCExpressionNode) exp, (FNCExpressionNode) x);
    }
}
