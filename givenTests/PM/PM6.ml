type r1 = {f : int} ;;
(* Type r1 defined. *)

match {f=1} with
    {f=x} -> x
  | _     -> 2
;;
(* - : int = 1 *)
