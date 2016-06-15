exception E1 and E2 ;;
(* Exception E1 defined.
   Exception E2 defined. *)

(1, 2, raise E1, raise E2, 3, 4) ;;
(* Uncaught exception: E2 *)
