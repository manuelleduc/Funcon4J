exception E1 and E2 ;;
(* Exception E1 defined.
   Exception E2 defined. *)

while raise E1 do raise E2 done ;;
(* Uncaught exception: E1 *)
