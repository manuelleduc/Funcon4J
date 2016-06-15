type ('a,'b) either = Left of 'a | Right of 'b;;
(* Type either defined. *)

let (v : (int,bool) either) = Left 7 ;;
(* v : (int, bool) either = Left 7 *)

v ;;
(* - : (int, bool) either = Left 7 *)
