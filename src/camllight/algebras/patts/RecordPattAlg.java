package camllight.algebras.patts;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import noa.syntax.Syntax;

import java.util.List;

public interface RecordPattAlg
        <E, A extends
                RecordAlg<E> &
                MapAlg<E> &
                SupplyGivenAlg<E> &
                FunctionAlg<E>> {
    A alg();

    @Syntax("patt = '{' IDTOKEN '=' patt recordpattappendix* '}'")
    default E recordPatt(java.lang.String name, E patt, List<E> recPatts) {
        E map = alg().map(alg().field(name), patt);
        for (E recPatt : recPatts) {
            map = alg().mapUnion(recPatt, map);
        }
        return alg().abs(alg().recordMatch(alg().given(), map));
    }

    @Syntax("recordpattappendix = ',' IDTOKEN '=' patt")
    default E recordPattAppendix(java.lang.String name, E patt) {
        return alg().map(alg().field(name), patt);
    }
}
