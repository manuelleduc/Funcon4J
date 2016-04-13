package funcons.algebras;

import funcons.types.Value;

public interface BindAlg<E> extends LogicWhileTrueAlg<E> {
    E id(java.lang.String s);
    E bindValue(E id, E exp);
    E boundValue(E id);
    E scope(E localBindings, E exp);
    E given(Value val);
    E supply(E exp, E x);
}