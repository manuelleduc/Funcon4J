package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;
import java.util.ListIterator;

public interface RecordAlg<E> extends ArrayAlg<E> {

    @Syntax("exp = '{' recordsingle recordappendix* '}'") @Level(1700)
    default E recordExp(E record, List<E> records) {
        if (records.isEmpty()) {
            return record;
        }

        ListIterator<E> it = records.listIterator(records.size());
        E result = it.previous();

        while (it.hasPrevious()) {
            result = alg().recordUnion(it.previous(), result);
        }
        return alg().recordUnion(record, result);
    }

    /*@Syntax("recordinnerlist = IDTOKEN '=' exp")
    default E recordEntrySingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), exp);
    }*/

    @Syntax("recordsingle = IDTOKEN '=' exp")
    default E recordEntrySingle(java.lang.String fieldName, E exp) {
        return alg().record(alg().field(fieldName), exp);
    }

    @Syntax("recordappendix = ',' IDTOKEN '=' exp")
    default E recordEntryAppendix(java.lang.String fieldname, E exp) {
        return recordEntrySingle(fieldname, exp);
    }
}
