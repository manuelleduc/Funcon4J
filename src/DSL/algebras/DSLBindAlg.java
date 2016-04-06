package DSL.algebras;

public interface DSLBindAlg<E> extends WhileTrueAlg<E> {
    E var(java.lang.String s);

    E bindValue(E var, E exp);
    E boundValue(E var);
    E scope(E env, E exp);
}
