package camllight.algebras;

import camllight.algebras.base.ModuleAlg;
import camllight.algebras.exprs.ControlAlg;
import camllight.algebras.exprs.LetAlg;

public interface AllAlg<E> extends
        ModuleAlg<E>,
        camllight.algebras.constants.ConstantsAlg<E>,
        ControlAlg<E>,
        camllight.algebras.decls.GlobalAlg<E>,
        LetAlg<E>,
        camllight.algebras.patts.PattMatchAlg<E>,
        camllight.algebras.typeexprs.TypeExpAlg<E>
{}
