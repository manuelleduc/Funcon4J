package funcons.algebras;

public interface RecursiveAlg<E> extends ListAlg<E> {
    E freshFwd();
    E freshFwds(E idList);
}
