package camllight.algebras;

import camllight.algebras.base.ModuleAlg;

public interface AllAlg<E> extends
        ModuleAlg<E>,
        camllight.algebras.constants.ConstantsAlg<E>,
        camllight.algebras.exprs.ExpControlAlg<E>,
        camllight.algebras.decls.GlobalAlg<E>,
        camllight.algebras.exprs.ExpLetAlg<E>,
        camllight.algebras.patts.PattMatchAlg<E>,
        camllight.algebras.typeexprs.TypeExpAlg<E>
{}
