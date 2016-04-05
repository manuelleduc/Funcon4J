package DSL;

public interface BoolLogicalAndFactory<T> extends BoolLogicalAndAlg<E> {
    LogicIfTrueAlg<E> ifTrueAlg();

    default E bool(java.lang.Boolean b) {
        return ifTrueAlg().bool(b);
    }

    default E lAnd(T e1, T e2) {
        return ifTrueAlg().ifTrue(e1, e2, bool(false));
    }
}
