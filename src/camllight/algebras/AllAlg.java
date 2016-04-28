package camllight.algebras;

import camllight.algebras.base.StartAlg;
import camllight.algebras.constants.ConstantsAlg;
import camllight.algebras.decls.BindAlg;
import camllight.algebras.exprs.ExpControlAlg;
import camllight.algebras.exprs.ExpLetAlg;
import camllight.algebras.patts.PattMatchAlg;
import camllight.algebras.typeexprs.TypeExpAlg;

public interface AllAlg<E> extends
        StartAlg<E>,
        ConstantsAlg<E>,
        ExpControlAlg<E>,
        BindAlg<E>,
        ExpLetAlg<E>,
        PattMatchAlg<E>,
        TypeExpAlg<E>
{}
