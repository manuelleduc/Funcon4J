exception Match_failure;;

let f = function | 0 -> `A`
            | 1 -> `B` ;;
(* f : int -> char = <fun> *)
 
f 0 ;;
(* - : char = `A` *)

f 1 ;;
(* - : char = `B` *)

try f 2 with Match_failure -> 0;;
(* Uncaught exception: Match_failure *)
