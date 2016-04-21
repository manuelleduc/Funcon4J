package camllight.algebras;

import camllight.algebras.base.StartAlg;
import camllight.algebras.constants.ConstantsAlg;
import camllight.algebras.decls.BindAlg;
import camllight.algebras.exprs.ExpControlAlg;
import camllight.algebras.exprs.ExpLetAlg;
import camllight.algebras.patternmatching.PattMatchAlg;
import camllight.algebras.patts.TuplePattAlg;

public interface AllAlg<E> extends
        StartAlg<E>,
        ConstantsAlg<E>,
        TuplePattAlg<E>,
        ExpControlAlg<E>,
        BindAlg<E>,
        ExpLetAlg<E>,
        PattMatchAlg<E>
{}
