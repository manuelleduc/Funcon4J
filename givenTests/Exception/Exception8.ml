exception E and E1 ;;
(* Exception E defined.
   Exception E1 defined. *)

raise E1 :: raise E ;;
(* Uncaught exception: E *)
