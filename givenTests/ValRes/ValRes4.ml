(* Value restriction test. *)

let fst (a,b) = a ;;
(* fst : 'a * 'b -> 'a = <fun> *)

let pair = ((function x -> x), 22) ;;
(* pair : ('a -> 'a) * int = <fun> *)

(fst pair) 7 ;;
(* 7 *)

(fst pair) true ;;
(* true *)
