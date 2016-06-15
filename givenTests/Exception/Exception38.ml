exception E1 and E2 and E3 ;;
(*
Exception E1 defined.
Exception E2 defined.
Exception E3 defined.
*)

let rec (f : int -> bool)    = function x -> raise E1
    and (g : char -> string) = function x -> raise E2
 in raise E3 ;;
(* Uncaught exception: E3 *)

