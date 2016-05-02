package camllight.algebras.decls;

import noa.syntax.Syntax;

public interface GlobalAlg<E> extends BindAlg<E> {
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
}
