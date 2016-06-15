type a = B of b 
and  b = A of a | C of c
and  c = AA of a * a | Bee of b | Cee of c | End ;;
(* Type a defined.
   Type b defined.
   Type c defined. *)

let x = C (Bee (A (B (C End)))) ;;
(* x : b = C (Bee (A (B (C End)))) *)

match x with
  | A (B (C End)) -> "WRONG"
  | C (Bee (A _)) -> "ok" ;;
(* - : string = "ok" *)
