package funcons.algebras;

import funcons.sorts.IEval;

public interface ElseAlg<E> extends ApplyAlg<E> {
    E equal(E x1, E x2);
    E only(E v);
    E any();
    E match(E exp, E pat);
    E pattAbs(E pat, E x);
    E fail();
    E throw_(IEval exception);
    E catch_(IEval x, IEval abs);
    E catchElseRethrow(IEval x, IEval abs);
    E else_(E x1, E x2);
    E preferOver(E a1, E a2);
}
