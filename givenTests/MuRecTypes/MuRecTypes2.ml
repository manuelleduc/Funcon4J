type ty1 = A of ty2 | Nil1
and  ty2 = B of ty1 | Nil2 ;;
(* Type ty1 defined.
   Type ty2 defined. *)

A (B Nil1) ;;
(* - : ty1 = A (B Nil1) *)
