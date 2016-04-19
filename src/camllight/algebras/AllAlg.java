package camllight.algebras;

import camllight.algebras.base.StartAlg;
import camllight.algebras.constants.ConstantsAlg;
import camllight.algebras.exprs.ExpControlAlg;
import camllight.algebras.patts.PattAlg;

public interface AllAlg<E> extends StartAlg<E>, ConstantsAlg<E>, PattAlg<E>, ExpControlAlg<E> {
}
