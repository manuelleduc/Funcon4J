package funcons.algebras.storage;

public interface AssignAlg<E> {
    E assign(E var, E x);
    E assignedValue(E var);
    E assignedValueIfVar(E v);
    E alloc(E x);
}
