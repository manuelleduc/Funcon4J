package camllight.algebras.patts;

import noa.syntax.Syntax;

public interface ListPattAlg<E> extends TuplePattAlg<E> {

    @Syntax("patt = emptylist")
    default E emptyListPatt(E l) {
        return alg().only(l);
    }

    @Syntax("patt = '[' headtaillistpatt ']'")
    default E headTailListPatt(E p) {
        return p;
    }

    @Syntax("headtaillistpatt = patt")
    default E headTailListPattSingle(E p) {
        return p;
    }

    @Syntax("headtaillistpatt = patt '::' headtaillistpatt")
    default E headTailListPattMulti(E p1, E p2) {
        return alg().listPrefixPatt(p1, p2);
    }

    @Syntax("patt = '[' patt ']'")
    default E singleElementListPatt(E p) {
        return headTailListPattMulti(p, alg().list());
    }

    @Syntax("patt = '[' pattlist ']'")
    default E pattList(E p) {
        return p;
    }

    @Syntax("pattlist = patt")
    default E pattListSingle(E p) {
        return p;
    }

    @Syntax("pattlist = patt ';' pattlist")
    default E pattListMulti(E p1, E p2) {
        return headTailListPattMulti(p1, p2);
    }

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
