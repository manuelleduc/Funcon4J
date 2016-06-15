let f0 = fun | 0 1 -> `A`
             | 1 2 -> `B` ;;
(* f0 : int -> int -> char = <fun> *)

f0 0 1;;
(* - : char = `A` *)

f0 1 2;;
(* - : char = `B` *)

f0 1 3;;
(* Uncaught exception: Match_failure *)
