type ('a,'b) ty = { mutable x : int ; mutable y : 'a ; z : 'b } ;;
(* Type ty defined. *)

let r = { x = 0 ; y = `N` ; z = true } ;;
(* r : (char, bool) ty = {x = 0; y = `N`; z = true} *)

r.x <- r.x + 7 ;;
(* - : unit = () *)

r.y <- `M` ;;
(* - : unit = () *)

r ;;
(* - : (char, bool) ty = {x = 7; y = `M`; z = true} *)
