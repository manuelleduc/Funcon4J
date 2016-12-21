package camllight.algebras.decls;

import funcons.algebras.collections.TupleAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.values.IntAlg;
import noa.syntax.Syntax;

public interface RecBindAlg<E, A extends RecursiveAlg<E> & IntAlg<E> & PolyTypeAlg<E> & TupleAlg<E>> {
    A alg();

    @Syntax("decl = 'let' 'rec' recdecl")
    default E declRec(E declTuple) {
        return alg().generaliseDecl(alg().recursiveTyped(
                alg().project(alg().lit(0), declTuple),
                alg().project(alg().lit(1), declTuple)));
    }
}
