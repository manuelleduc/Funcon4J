type 'a t = A | B ;;
(* Type t defined. *)

let a = A ;;
(* a : 'a t = A *)

match a with
    B -> `B`
  | A -> `A` ;;
(* - : char = `A`   *)
