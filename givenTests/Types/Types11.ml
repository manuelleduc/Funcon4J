type ty == int list * bool * (char -> unit) * string ;;
(* Type ty defined. *)

let (f : ty -> bool) = function ([ 0 ] , b , g , s) -> b ;;
(* f : ty -> bool = <fun> *)
