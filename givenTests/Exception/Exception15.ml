exception E2 ;;
(* Exception E2 defined. *)

false && raise E2 ;;
(* - : bool = false *)

true || raise E2 ;;
(* - : bool = true *)
