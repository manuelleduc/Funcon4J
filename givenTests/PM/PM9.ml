exception Match_failure;;

let f0 = fun a b -> (match (a,b) with (0, 1) -> `A`
             | (1, 2) -> `B`);;
(* f0 : int -> int -> char = <fun> *)

f0 0 1;;
(* - : char = `A` *)

f0 1 2;;
(* - : char = `B` *)

try f0 1 3 with Match_failure -> 0;;
(* Uncaught exception: Match_failure *)
