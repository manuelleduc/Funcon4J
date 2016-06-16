exception Match_failure;;

type ty = A | B ;;
(* Type ty defined. *)

try (A = B) with Match_failure -> 0;;
(* Match_failure *)
