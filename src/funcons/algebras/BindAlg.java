package funcons.algebras;

public interface BindAlg<E> extends LogicWhileTrueAlg<E> {
    E var(java.lang.String s);
    E bindValue(E var, E exp);
    E boundValue(E var);
    E scope(E localBindings, E exp);
}