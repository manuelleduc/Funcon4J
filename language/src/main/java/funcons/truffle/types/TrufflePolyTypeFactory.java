package funcons.truffle.types;

import funcons.truffle.nodes.FNCBuildAST;
import funcons.algebras.types.PolyTypeAlg;

public interface TrufflePolyTypeFactory extends PolyTypeAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST instantiatePoly(FNCBuildAST x) {
        return x;
    }

    @Override
    default FNCBuildAST instantiateIfPoly(FNCBuildAST x) {
        return x;
    }

    @Override
    default FNCBuildAST generalise(FNCBuildAST x) {
        return x;
    }

    @Override
    default FNCBuildAST generaliseIfPoly(FNCBuildAST x) {
        return x;
    }

    @Override
    default FNCBuildAST generaliseDecl(FNCBuildAST x) {
        return x;
    }

    @Override
    default FNCBuildAST generaliseMap(FNCBuildAST x) {
        return x;
    }
}
