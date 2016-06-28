package camllight.algebras.decls;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;

public interface GlobalAlg
        <E, A extends
                MapAlg<E> &
                RecordAlg<E> &
                TypeAlg<E> &
                SupplyGivenAlg<E> &
                BindingAlg<E> &
                NullAlg<E> &
                FunctionAlg<E> &
                TupleAlg<E> &
                PolyTypeAlg<E> &
                IntAlg<E> &
                RecursiveAlg<E> &
                ExceptionAlg<E> &
                PatternAlg<E> &
                CurryAlg<E>>
        extends BindAlg<E, A> {

    @Override
    A alg();

    @Syntax("decl = 'type' decloptionalvartypes declnewtypeappendix*")
    default E declNewType(E environment, List<E> environments) {
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("declnewtypeappendix = 'and' decloptionalvartypes")
    default E declNewTypeAppendix(E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = declnewtype") @Level(0)
    default E declNewTypeWithoutVarTypes(E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = vartype declnewtype")
    default E declNewTypeWithVarType(E varType, E environment) {
        return environment;
    }

    // Syntax only
    @Syntax("decloptionalvartypes = '(' vartype@','* ')' declnewtype") @Level(1)
    default E declNewTypeWithVarTypes(List<E> varTypes, E environment) {
        return environment;
    }

    //Syntax only
    @Syntax("declnewtype = IDTOKEN '==' type")
    default E declTypeDefEquals(java.lang.String idToken, E type) {
        return alg().typeDef(alg().id(idToken), type);
    }

    @Syntax("declnewtype = IDTOKEN '=' CONSTRTOKEN decltypeappendix*")
    default E declNewEnumType(java.lang.String identToken, java.lang.String constrToken, List<E> environments) {
        E environment = declEnumTypeAppendix(constrToken);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("declnewtype = IDTOKEN '=' CONSTRTOKEN 'of' type decltypeappendix*")
    default E declNewConstrType(java.lang.String identToken, java.lang.String constrToken, E type, List<E> environments) {
        E environment = declConstrTypeAppendix(constrToken, type);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("decltypeappendix = '|' CONSTRTOKEN 'of' type") @Level(1)
    default E declConstrTypeAppendix(java.lang.String constrToken, E type) {
        return alg().bindValue(alg().id(constrToken), alg().abs(alg().clVariant(constrToken, alg().given())));
    }

    @Syntax("decltypeappendix = '|' CONSTRTOKEN") @Level(0)
    default E declEnumTypeAppendix(java.lang.String constrToken) {
        return alg().bindValue(alg().id(constrToken), alg().clVariant(constrToken, alg().null_()));
    }

    // Syntax only
    @Syntax("declnewtype = ident '=' '{' decllabeltype@','+ '}'")
    default E declRecordType(E id, List<E> labelTypeTuples) {
        return alg().environment();
    }

    @Syntax("decllabeltype = IDTOKEN ':' type")
    default E declLabelType(java.lang.String idToken, E type) {
        return alg().tuple(alg().field(idToken), type);
    }

    @Syntax("decllabeltype = 'mutable' IDTOKEN ':' type")
    default E declMutableLabelType(java.lang.String idToken, E type) {
        return alg().tuple(alg().field(idToken), type);
    }

    @Syntax("decl = 'exception' CONSTRTOKEN declexceptionappendix*")
    default E declEnumException(java.lang.String constrToken, List<E> environments) {
        E environment = declEnumExceptionAppendix(constrToken);
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("decl = 'exception' CONSTRTOKEN 'of' type declexceptionappendix*")
    default E declConstrException(java.lang.String constrToken, E type, List<E> environments) {
        E environment = declConstrExceptionAppendix(constrToken, type);
        for (E otherEnvironment : environments) {
            environment = alg().mapUnion(environment, otherEnvironment);
        }
        return environment;
    }

    @Syntax("declexceptionappendix = 'and' CONSTRTOKEN") @Level(0)
    default E declEnumExceptionAppendix(java.lang.String constrToken) {
        return alg().bindValue(alg().id(constrToken), alg().clVariant(constrToken, alg().null_()));
    }

    @Syntax("declexceptionappendix = 'and' CONSTRTOKEN 'of' type") @Level(1)
    default E declConstrExceptionAppendix(java.lang.String constrToken, E type) {
        return alg().bindValue(alg().id(constrToken), alg().abs(alg().clVariant(constrToken, alg().given())));
    }
}
