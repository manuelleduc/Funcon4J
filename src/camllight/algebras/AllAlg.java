package camllight.algebras;

public interface AllAlg<E> extends
        camllight.algebras.base.ModuleAlg<E>,
        camllight.algebras.constants.ConstantsAlg<E>,
        camllight.algebras.decls.GlobalAlg<E>,
        camllight.algebras.exprs.LetAlg<E>,
        camllight.algebras.patts.PattMatchAlg<E>,
        camllight.algebras.typeexprs.TypeExpAlg<E>
{}
