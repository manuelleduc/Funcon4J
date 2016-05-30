package camllight.algebras.decls;

import noa.syntax.Syntax;

import java.util.Iterator;
import java.util.List;

public interface GlobalAlg<E> extends BindAlg<E> {
    @Override
    funcons.algebras.RecordAlg<E> alg();

    @Syntax("decllabelsandvariants = ident '=' IDTOKEN 'of' type")
    default E declLabelsAndVariantsDecl(E id, java.lang.String idToken, E type) {
        return alg().scopeNominalCoercion(
                variantTypeDecl(idToken, type),
                alg().boundType(id),
                alg().pattAbs(
                        alg().bind(alg().meta("nom_tag")),
                        alg().mapUnion(
                                alg().bindValue(
                                        alg().id(idToken),
                                        alg().close(alg().abs(alg().nomVal(
                                                alg().boundValue(alg().meta("nom_tag")),
                                                alg().variant(idToken, alg().given()))))),
                                alg().bindValue(alg().nameId("variant_selector", idToken),
                                        alg().close(alg().abs(alg().nomValSelect(
                                                alg().boundValue(alg().meta("nom_tag")),
                                                alg().given())))))));
    }

    @Syntax("decl = 'type' IDTOKEN '=' CONSTRTOKEN declenumtypeappendix*")
    default E declNewEnumType(java.lang.String identToken, java.lang.String constrToken, List<E> environments) {
        E environment = declEnumTypeAppendix(constrToken);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("decl = 'type' IDTOKEN '=' CONSTRTOKEN 'of' type declconstrtypeappendix*")
    default E declNewConstrType(java.lang.String identToken, java.lang.String constrToken, E type, List<E> environments) {
        E environment = declConstrTypeAppendix(constrToken, type);
        for (E env : environments) {
            environment = alg().mapUnion(environment, env);
        }
        return environment;
    }

    @Syntax("declconstrtypeappendix = '|' CONSTRTOKEN 'of' type")
    default E declConstrTypeAppendix(java.lang.String constrToken, E type) {
        return alg().environment(alg().id(constrToken), alg().abs(alg().variant(constrToken, alg().given())));
    }

    @Syntax("declenumtypeappendix = '|' CONSTRTOKEN")
    default E declEnumTypeAppendix(java.lang.String constrToken) {
        return alg().environment(alg().id(constrToken), alg().variant(constrToken, alg().null_()));
    }

    @Syntax("decl = 'type' ident '=' '{' decllabeltype@','+ '}'")
    default E declRecordType(E id, List<E> labelTypeTuples) {
        //TODO
        return alg().null_();
    }

    @Syntax("decllabeltype = IDTOKEN ':' type")
    default E declLabelType(java.lang.String idToken, E type) {
        return alg().tuple(alg().field(idToken), type);
    }
}
