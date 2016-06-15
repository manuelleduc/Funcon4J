exception E of bool ;;
(* Exception E defined. *)

let x = E true ;;
(* x : exn = E true *)

exception E of int ;;
(* Exception E defined. *)

match x with
  | E i -> i + 1
  | _   -> 99 ;;
(* - : int = 99 *)
