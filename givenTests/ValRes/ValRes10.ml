let id = function u -> u ;;
(* id : 'a -> 'a = <fun> *)

let (f : 'a -> 'a) = id (function x -> x) ;;
(* f : '_a -> '_a = <fun> *)

f 7 ;;
(* - : int = 7 *)
