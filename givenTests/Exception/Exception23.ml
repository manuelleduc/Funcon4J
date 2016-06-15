let f = function 0 -> `X` ;;
(* f : int -> char = <fun> *)

try f 1
with Match_failure _ -> `O` ;;
(* - : char = `O` *)

