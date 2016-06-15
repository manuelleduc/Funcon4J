type ty1 =  C of int
and  ty2 == ty1 ;;
(* Type ty1 defined.
   Type ty2 defined. *)

(C 9 : ty2) ;;
(* - : ty2 = C 9 *)
