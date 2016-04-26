package camllight.algebras.patts;

import noa.syntax.Syntax;

public interface ListPattAlg<E> extends TuplePattAlg<E> {

    //@Syntax("patt = '[' ']'")

    /*
    to-funcons:
            |[ patt[: [ ] :] ]| ->
            |[ only(list_empty) ]|
    to-funcons:
            |[ patt[: ~P1 :: ~P2 :] ]| ->
            |[ list_prefix_patt(patt[: ~P1 :], patt[: ~P2 :]) ]|
    to-funcons:
            |[ patt[: [ ~P ] :] ]| ->
            |[ patt[: ~P :: [ ] :] ]|
    to-funcons:
            |[ patt[: [ ~P1 ; ~P2 ... ] :] ]| ->
            |[ patt[: ~P1 :: [ ~P2 ... ] :] ]| */
}
