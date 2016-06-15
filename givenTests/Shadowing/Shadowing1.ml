type ty = { x : int } ;;
(* Type ty defined. *)

let x = `X`;;
(* x : char = `X` *)

let r = { x = 7 } ;;
(* r : ty = {x = 7} *)

x ;;
(* - : char = `X` *)

r.x ;;
(* - : int = 7 *)
