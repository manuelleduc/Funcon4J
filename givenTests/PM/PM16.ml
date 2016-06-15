type t = A of int | B of bool ;;
(* Type t defined. *)

match A 2 with
    B true -> "Bad"
  | A 2    -> "Ok" ;;
(* - : string = "Ok" *)
