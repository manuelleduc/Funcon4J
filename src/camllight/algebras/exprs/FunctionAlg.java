package camllight.algebras.exprs;

import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.StoreAlg;
import funcons.algebras.types.PolyTypeAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface FunctionAlg
        <E, A extends
                funcons.algebras.collections.RecordAlg<E> &
                funcons.algebras.functions.FunctionAlg<E> &
                PolyTypeAlg<E> &
                EnvironmentAlg<E> &
                RecursiveAlg<E> &
                StoreAlg<E> &
                funcons.algebras.controlflow.ExceptionAlg<E>> {
    A alg();

    @Syntax("exp = function") @Level(200)
    default E functionExpr(E f) {
        return f;
    }

    @Syntax("exp = functionapp") @Level(1517)
    default E functionApplicationExp(E fa) {
        return fa;
    }

    @Syntax("functionapp = '(' functionapp ')'") @Level(2)
    default E functionApplicationBracketed(E fa) {
        return fa;
    }

    @Syntax("functionapp = functionapp exp") @Level(1)
    default E functionApplicationApplication(E fa, E exp) {
        return alg().apply(fa, exp);
    }

    @Syntax("functionapp = function exp") @Level(0)
    default E functionApplication(E e1, E e2) {
        return alg().apply(e1, e2);
    }

    @Syntax("function = ident")
    default E functionId(E id) {
        return alg().instantiateIfPoly(alg().followIfFwd(alg().boundValue(id)));
    }

    @Syntax("function = function '.' IDTOKEN")
    default E functionRecordSelect(E record, java.lang.String fieldName) {
        return alg().assignedValueIfVar(alg().recordSelect(record, alg().field(fieldName)));
    }

    @Syntax("function = '(' function ')'")
    default E bracketedFunction(E f) {
        return f;
    }

    @Syntax("function = 'begin' function 'end'")
    default E beginEndFunction(E f) {
        return f;
    }

    @Syntax("function = 'function' pattmatch")
    default E function(E pm) {
        return alg().close(alg().preferOver(pm, alg().abs(alg().throw_(alg().matchFailure()))));
    }

    @Syntax("function = 'fun' pattmatchsingle") @Level(1)
    default E func(E pm) {
        return function(pm);
    }

    @Syntax("function = 'fun' pattmatchcurried") @Level(0)
    default E curriedFunc (E pm) {
        return function(pm);
    }
}
