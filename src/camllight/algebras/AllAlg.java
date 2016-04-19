package camllight.algebras;

import camllight.algebras.base.StartAlg;
import camllight.algebras.constants.ConstantsAlg;
import camllight.algebras.exprs.ExpControlAlg;
import camllight.algebras.exprs.FunctionAlg;
import camllight.algebras.patternmatching.PattMatchAlg;
import camllight.algebras.patts.PattAlg;

public interface AllAlg<E> extends
        StartAlg<E>,
        ConstantsAlg<E>,
        PattAlg<E>,
        ExpControlAlg<E>,
        FunctionAlg<E>,
        PattMatchAlg<E>
{}
