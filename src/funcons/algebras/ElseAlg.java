package funcons.algebras;

import funcons.signals.Signal;

public interface ElseAlg<E> extends ApplyAlg<E> {

    E equal(E x1, E x2);
    E only(E v);
    E any();
    E fail();
    E throw_(Signal s);
    E else_(E x1, E x2);
    E preferOver(E a1, E a2);
}
