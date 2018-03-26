package funcons.truffle.entities;

import funcons.algebras.entities.SupplyGivenAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<CLStatementNode> {

    @Override
    default CLStatementNode given() {
//        return (env, given) -> given;
        return null; // TODO
    }

    @Override
    default CLStatementNode supply(CLStatementNode exp, CLStatementNode x) {
//        return (env, given) -> x.eval(env, exp.eval(env, given));
        return null; // TODO
    }
}
