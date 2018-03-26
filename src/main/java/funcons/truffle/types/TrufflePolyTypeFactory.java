package funcons.truffle.types;

import funcons.algebras.types.PolyTypeAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TrufflePolyTypeFactory extends PolyTypeAlg<CLStatementNode> {

    @Override
    default CLStatementNode instantiatePoly(CLStatementNode x) {
        return x;
    }

    @Override
    default CLStatementNode instantiateIfPoly(CLStatementNode x) {
        return x;
    }

    @Override
    default CLStatementNode generalise(CLStatementNode x) {
        return x;
    }

    @Override
    default CLStatementNode generaliseIfPoly(CLStatementNode x) {
        return x;
    }

    @Override
    default CLStatementNode generaliseDecl(CLStatementNode x) {
        return x;
    }

    @Override
    default CLStatementNode generaliseMap(CLStatementNode x) {
        return x;
    }
}
