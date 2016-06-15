(function x -> x) 1 ;;
(* - : int = 1 *)

let f = function x -> x + 1;;
(* WAS: let f = (function x -> x) (prefix + 1) ;; *)
(* - : int -> int = <fun> *)

f 3 ;;
(* - : int = 4 *)
