exception E1 and E2 ;;
(*
Exception E1 defined.
Exception E2 defined.
*)

let x = raise E1 in raise E2 ;;
(* Uncaught exception: E1 *)

