exception E ;;

let f = function 0 -> `X` ;;
(* f : int -> char = <fun> *)

try f 1
with E -> `Z`
   | Match_failure _ -> `O` ;;
(* - : char = `O` *)
