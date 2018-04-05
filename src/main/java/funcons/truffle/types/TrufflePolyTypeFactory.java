package funcons.truffle.types;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.types.PolyTypeAlg;

public interface TrufflePolyTypeFactory extends PolyTypeAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode instantiatePoly(FNCExecuteNode x) {
        return x;
    }

    @Override
    default FNCExecuteNode instantiateIfPoly(FNCExecuteNode x) {
        return x;
    }

    @Override
    default FNCExecuteNode generalise(FNCExecuteNode x) {
        return x;
    }

    @Override
    default FNCExecuteNode generaliseIfPoly(FNCExecuteNode x) {
        return x;
    }

    @Override
    default FNCExecuteNode generaliseDecl(FNCExecuteNode x) {
        return x;
    }

    @Override
    default FNCExecuteNode generaliseMap(FNCExecuteNode x) {
        return x;
    }
}
