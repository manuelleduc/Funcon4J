package camllight.algebras.typeexprs;

import funcons.algebras.types.TupleTypeAlg;
import funcons.algebras.types.TypeAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface TypeExpAlg<E, A extends TypeAlg<E> & TupleTypeAlg<E>> {
    A alg();

    @Syntax("type = '(' type ')'")
    default E bracketedType(E type) {
        return type;
    }

    @Syntax("type = IDTOKEN")
    default E typeId(java.lang.String name) {
        return alg().type(name);
        //return alg().boundType(alg().id(name));
    }

    @Syntax("type = type '->' type")
    default E functionType(E t1, E t2) {
        return alg().depends(t1, t2);
    }

    // Syntax only
    @Syntax("type = type IDTOKEN")
    default E typeIdType(E type, java.lang.String idToken) {
        return typeId(idToken);
    }

    // Syntax only
    @Syntax("type = '(' type@','+ ')' IDTOKEN")
    default E typesIdType(List<E> types, java.lang.String idToken) {
        return typeId(idToken);
    }

    @Syntax("type = vartype")
    default E varTypeType(E varType) {
        return varType;
    }

    @Syntax("vartype = '\\'' IDTOKEN")
    default E varType(java.lang.String id) {
        return alg().typeVar(id);
    }

    @Syntax("type = type tupletypelist+")
    default E tupleType(E t, List<E> ts) {
        E tuple = alg().tupleType();

        ListIterator<E> it = ts.listIterator(ts.size());
        while (it.hasPrevious()) {
            tuple = alg().tupleTypePrefix(it.previous(), tuple);
        }

        return alg().tupleTypePrefix(t, tuple);
    }

    @Syntax("tupletypelist = '*' type")
    default E tupleTypeSingle(E type) {
        return type;
    }

    @Syntax("varianttype = CONSTRTOKEN") @Level(0)
    default E variantDecl(java.lang.String token) {
        return alg().clVariant(token, alg().tupleType());
    }

    @Syntax("varianttype = CONSTRTOKEN 'of' type") @Level(1)
    default E variantTypeDecl(java.lang.String token, E type) {
        return alg().clVariant(token, type);
    }
}
