type 'a t = C;;
(* Type t defined. *)

let c = C ;;
(* c : 'a t = C *)

if true then c else C ;;
(* - : 'a t = C *)
