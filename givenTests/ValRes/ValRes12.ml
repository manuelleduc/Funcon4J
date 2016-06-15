let id = function u -> u ;;
(* id : 'a -> 'a = <fun> *)

let ((f : 'a -> 'a), (e : 'b list) ) = id ((function x -> x), []) ;;
(*
   f : '_a -> '_a = <fun>
   e : '_a list = [] 
*)

f 7 ;;
(* - : int = 7 *)

true :: e ;;
(* - : bool list = [true] *)
