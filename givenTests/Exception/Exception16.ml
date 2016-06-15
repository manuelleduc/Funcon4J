exception E ;;
(* Exception E defined. *)

type r = { x : int } ;;
(* Type r defined. *)

(raise E).x ;;
(* Uncaught exception: E *)
