exception E and E1 ;;
(*
Exception E defined.
Exception E1 defined.
*)

match raise E with
 | _ -> raise E1 ;;
(* Uncaught exception: E *)




