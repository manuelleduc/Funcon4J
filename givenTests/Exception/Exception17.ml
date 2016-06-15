exception E and E1 and E2 ;;
(* Exception E defined.
   Exception E1 defined.
   Exception E2 defined. *)

if raise E then raise E1 else raise E2
;;
(* Uncaught exception: E *)
