package camllight.algebras.typeexprs;

import camllight.algebras.base.StartAlg;
import noa.syntax.Syntax;

public interface TypeExpAlg<E> extends StartAlg<E> {

    @Syntax("type = '(' type ')'")
    default E bracketedType(E type) {
        return type;
    }

    @Syntax("type = IDTOKEN")
    default E typeId(java.lang.String name) {
        return alg().boundType(alg().id(name));
    }

    @Syntax("type = type '->' type")
    default E functionType(E t1, E t2) {
        return alg().depends(t1, t2);
    }

    /*
    to-funcons:
    |[ type[: ~T ~LI :] ]| ->
    |[ instantiate_type(type[: ~LI :], type_list[: ~T :]) ]|
    to-funcons:
    |[ type[: (~T1 , ~T2 ...) ~LI :] ]| ->
    |[ instantiate_type(type[: ~LI :], type_list[: ~T1 , ~T2 ... :]) ]|
     */

    @Syntax("type = '\\'' IDTOKEN")
    default E varType(java.lang.String id) {
        return alg().typeVar(id);
    }
}
