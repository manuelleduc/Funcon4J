package camllight.algebras;

public interface AllAlg<E> extends
        camllight.algebras.base.StartAlg<E>,
        camllight.algebras.constants.ConstantsAlg<E>,
        camllight.algebras.exprs.ExpControlAlg<E>,
        camllight.algebras.decls.GlobalAlg<E>,
        camllight.algebras.exprs.ExpLetAlg<E>,
        camllight.algebras.patts.PattMatchAlg<E>,
        camllight.algebras.typeexprs.TypeExpAlg<E>
{}
