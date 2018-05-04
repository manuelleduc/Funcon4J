package camllight.algebras.exprs;

import funcons.algebras.entities.AssignAlg;
import funcons.algebras.functions.*;
import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface RecordAlg<E,
        A extends
                funcons.algebras.collections.RecordAlg<E> &
                AssignAlg<E> &
                funcons.algebras.functions.FunctionAlg<E>> {
    A alg();

    @Syntax("exp = '{' recordsingle@','+ '}'") @Level(1700)
    default E recordExp(List<E> records) {
        ListIterator<E> it = records.listIterator(records.size());
        E record = it.previous();
        while(it.hasPrevious()) {
            record = alg().recordUnion(it.previous(), record);
        }
        return record;
    }

    @Syntax("recordsingle = IDTOKEN '=' exp")
    default E recordEntrySingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), exp);
    }

    @Syntax("recordsingle = 'mutable' IDTOKEN '=' exp")
    default E recordEntryMutableSingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), alg().alloc(exp));
    }

    @Syntax("exp = exp '.' IDTOKEN") @Level(1400)
     default E recordSelectExp(E record, java.lang.String fieldName) {
        return alg().assignedValueIfVar(alg().recordSelect(record, alg().field(fieldName)));
    }

    @Syntax("function = '(' exp '.' IDTOKEN ')' exp") @Level(1517)
    default E recordSelectApplyFunction(E record, java.lang.String fieldName, E exp) {
        return alg().apply(
                alg().assignedValueIfVar(alg().recordSelect(record, alg().field(fieldName))),
                exp
        );
    }

    @Syntax("exp = exp '.' IDTOKEN '<-' exp") @Level(1300)
    default E recordAssignExp(E record, java.lang.String fieldName, E exp) {
        return alg().assign(alg().recordSelect(record, alg().field(fieldName)), exp);
    }
}
