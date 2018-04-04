package funcons.truffle.types;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.types.PolyTypeAlg;

public interface TrufflePolyTypeFactory extends PolyTypeAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode instantiatePoly(CLExecuteNode x) {
        return x;
    }

    @Override
    default CLExecuteNode instantiateIfPoly(CLExecuteNode x) {
        return x;
    }

    @Override
    default CLExecuteNode generalise(CLExecuteNode x) {
        return x;
    }

    @Override
    default CLExecuteNode generaliseIfPoly(CLExecuteNode x) {
        return x;
    }

    @Override
    default CLExecuteNode generaliseDecl(CLExecuteNode x) {
        return x;
    }

    @Override
    default CLExecuteNode generaliseMap(CLExecuteNode x) {
        return x;
    }
}
