exception E ;;
(* Exception E defined. *)

let x1 = E ;;
(* x1 : exn = E *)

exception E ;;
(* Exception E defined. *)

let x2 = E ;;
(* x2 : exn = E *)

x1 = x2 ;;
(* - : bool = false *)
