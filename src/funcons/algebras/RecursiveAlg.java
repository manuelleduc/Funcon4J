package funcons.algebras;

public interface RecursiveAlg<E> extends ModuleAlg<E> {
    E freshFwd();
    E freshFwds(E idList);
    E setForwards(E idFwdMap);
    E reclose(E idFwdsMap, E decl);
}
