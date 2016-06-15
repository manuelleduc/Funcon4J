type 'a t = C of int;;
(* Type t defined. *)

let c = C 9 ;;
(* c : 'a t = C 9 *)

if true then c else C 7 ;;
(* - : 'a t = C 9 *)
