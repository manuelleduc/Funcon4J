exception E1 ;;
(* Exception E1 defined. *)

(E1 : exn) ;;
(* - : exn = E1 *)

type exn = A | B of int ;;
(* Type exn defined. *)

exception E2 ;;
(* Exception E2 defined. *)

(A : exn) ;;
(* - : exn = A *)

try raise E2
with _ -> "okay" ;;
(* - : string = "okay" *)
