exception E2 and E3 ;;
(*
Exception E2 defined.
Exception E3 defined.
*)

let rec f = function x -> 1
    and g = function _ -> raise E2
 in raise E3 ;;
(* Uncaught exception: E3 *)

