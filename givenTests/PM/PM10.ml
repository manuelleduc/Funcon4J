exception Failure_true;;

let f = fun 0 1 4 -> `A` ;;
(* f : int -> int -> char = <fun> *)

f 0 1 4;;
(* - : char = `A` *)

try f 0 1 5 with Failure_true -> 0;;
(* Uncaught exception: Match_failure *)
