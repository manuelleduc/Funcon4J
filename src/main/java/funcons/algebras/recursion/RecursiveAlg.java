package funcons.algebras.recursion;

public interface RecursiveAlg<E> {
    E freshFwd();
    E freshFwds(E idList);
    E setForwards(E idFwdMap);
    E reclose(E idFwdsMap, E decl);
    E recursive(E idList,E decl);
    E recursiveTyped(E idTypeMap, E decl);
    E followFwd(E fwd);
    E followIfFwd(E fwd);
}
