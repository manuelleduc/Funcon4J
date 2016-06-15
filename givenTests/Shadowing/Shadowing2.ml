type t1 = A of int ;;
(* Type t1 defined. *)

type t2 = A of bool ;;
(* Type t2 defined. *)

let c = A true ;;
(* c : t2 = A true *)

match c with
  A b -> b ;;
(* - : bool = true *)
