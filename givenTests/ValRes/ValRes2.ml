(* Value restriction test. *)

let id = function x -> x
 in (id 1, id true) ;;
(* - : int * bool = 1, true *)
